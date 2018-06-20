package net.overload.inputOutput.file;

import net.overload.CharacterSheet;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Base64;

public class SaveFile {
    private static final String FILE_NAME = "./savefile.txt";

    public void saveCharacterSheet(final CharacterSheet characterSheet) throws SaveGameDataException {
        try {
            final String sheet = characterSheetToString(characterSheet);
            writeStringToFile(sheet);
        } catch (final IOException e) {
            throw new SaveGameDataException(e.getMessage());
        }
    }

    public CharacterSheet loadCharacterSheet() throws SaveGameDataException{
        try {
            final String sheet = readFileIntoString();
            final CharacterSheet characterSheet = stringToCharacterSheet(sheet);

            return characterSheet;
        } catch (final IOException | ClassNotFoundException e) {
            throw new SaveGameDataException(e.getMessage());
        }
    }

    private void writeStringToFile(final String serializedObject) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(FILE_NAME)) {
            printWriter.print(serializedObject);
        }
    }

    private String readFileIntoString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(FILE_NAME)));
        String sheet = bufferedReader.readLine();

        return sheet;
    }

    public CharacterSheet fileToCharacterSheet() throws IOException, ClassNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(FILE_NAME)));
        CharacterSheet characterSheet = stringToCharacterSheet(bufferedReader.readLine());

        return characterSheet;
    }

    private String characterSheetToString(final CharacterSheet characterSheet) throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream so = new ObjectOutputStream(bo);
        so.writeObject(characterSheet);
        so.flush();

        return Base64.getEncoder().encodeToString(bo.toByteArray());
    }

    private CharacterSheet stringToCharacterSheet(final String serializedObject) throws IOException, ClassNotFoundException {
        byte b[] = Base64.getDecoder().decode(serializedObject);
        ByteArrayInputStream bi = new ByteArrayInputStream(b);
        ObjectInputStream si = new ObjectInputStream(bi);

        return (CharacterSheet) si.readObject();
    }
}
