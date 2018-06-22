package net.overload.inputOutput.file;

import net.overload.CharacterSheet;
import net.overload.inputOutput.file.exceptions.SaveGameDataException;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

public class LoadFromFile {
    private static final String FILE_NAME = "./savefile.txt";

    public CharacterSheet loadCharacterSheet() throws SaveGameDataException {
        try {
            final String sheet = readFileIntoString();
            final CharacterSheet characterSheet = stringToCharacterSheet(sheet);

            return characterSheet;
        } catch (final IOException | ClassNotFoundException e) {
            throw new SaveGameDataException(e.getMessage());
        }
    }

    private String readFileIntoString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(FILE_NAME)));
        String sheet = bufferedReader.readLine();

        return sheet;
    }


    private CharacterSheet stringToCharacterSheet(final String serializedObject) throws IOException, ClassNotFoundException {
        byte b[] = Base64.getDecoder().decode(serializedObject);
        ByteArrayInputStream bi = new ByteArrayInputStream(b);
        ObjectInputStream si = new ObjectInputStream(bi);

        return (CharacterSheet) si.readObject();
    }
}