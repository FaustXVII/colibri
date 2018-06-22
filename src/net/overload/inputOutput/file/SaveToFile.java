package net.overload.inputOutput.file;

import net.overload.CharacterSheet;
import net.overload.inputOutput.file.exceptions.SaveGameDataException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Base64;

public class SaveToFile {
    private static final String FILE_NAME = "./savefile.txt";

    public void saveCharacterSheet(final CharacterSheet characterSheet) throws SaveGameDataException {
        try {
            final String sheet = characterSheetToString(characterSheet);
            writeStringToFile(sheet);

        } catch (final IOException e) {
            throw new SaveGameDataException(e.getMessage());
        }
    }

    private void writeStringToFile(final String serializedObject) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(FILE_NAME)) {
            printWriter.print(serializedObject);
        }
    }

    private String characterSheetToString(final CharacterSheet characterSheet) throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream so = new ObjectOutputStream(bo);
        so.writeObject(characterSheet);
        so.flush();

        return Base64.getEncoder().encodeToString(bo.toByteArray());
    }
}