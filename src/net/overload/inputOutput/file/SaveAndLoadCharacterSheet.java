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

public class SaveAndLoadCharacterSheet {
    // ToDo Maak hier twee lossen classes van, load & save
    private static final String FILE_REFERENCE = "/temp/savefile.txt";

    public CharacterSheet laod() throws LoadGameDataException {
        File saveFile = getSaveFile();
        String fileContent = fileToString(saveFile);
        CharacterSheet characterSheet = stringToCharacterSheet(fileContent);

        return characterSheet;
    }

    private File getSaveFile() {
        return new File(FILE_REFERENCE);
    }

    private String fileToString(final File saveFile) throws LoadGameDataException {
        try {
            FileReader fileReader = new FileReader(saveFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileContent = bufferedReader.readLine();

            return fileContent;
        } catch (final IOException exception) {
            throw new LoadGameDataException(exception.getMessage());
        }
    }

    private CharacterSheet stringToCharacterSheet(final String fileConetent) throws LoadGameDataException {
        try {
            byte bytes[] = Base64.getDecoder().decode(fileConetent);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            CharacterSheet characterSheet = (CharacterSheet) objectInputStream.readObject();

            return characterSheet;
        } catch (final IOException exception) {
            throw new LoadGameDataException(exception.getMessage());
        } catch (final ClassNotFoundException exception) {
            throw new LoadGameDataException(exception.getMessage());
        }
    }

    public void save(final CharacterSheet characterSheet) throws SaveGameDataException {
        String serializedSheet = characterSheetToString(characterSheet);
        stringToFile(serializedSheet);
    }

    private String characterSheetToString(final CharacterSheet characterSheet) throws SaveGameDataException{
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(characterSheet);
            outputStream.flush();
            String serializedSheet = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());

            return serializedSheet;
        } catch (final IOException exception) {
            throw new SaveGameDataException(exception.getMessage());
        }
    }

    private void stringToFile (final String serializedSheet) throws SaveGameDataException {
        try (PrintWriter printWriter = new PrintWriter(FILE_REFERENCE)) {
            printWriter.print(serializedSheet);
        }catch (final IOException exception){
            throw new SaveGameDataException(exception.getMessage());
        }
    }
}
