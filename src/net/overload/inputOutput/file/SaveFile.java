package net.overload.inputOutput.file;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import net.overload.CharacterSheet;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class SaveFile {
    private static final String FILE_NAME = "./savefile.txt";

    public void save(final CharacterSheet characterSheet) {
        try (PrintWriter printWriter = new PrintWriter(FILE_NAME)) {
            printWriter.print(serialize(characterSheet));
        } catch (final FileNotFoundException exception) {
            throw new RuntimeException("Could not save, file not found: " + exception);
        }
    }

    public void load() {
        File file = new File(FILE_NAME);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            CharacterSheet characterSheet =  (CharacterSheet) deserialize(bufferedReader.readLine());
            System.out.print(characterSheet.toString());


        } catch (final FileNotFoundException exception) {
            throw new RuntimeException("Could not load, file not found: " + exception);
        } catch (final IOException exception) {
            throw new RuntimeException("Could not load, I/O problem: " + exception);
        }
    }

    private String serialize(final CharacterSheet characterSheet) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream so = new ObjectOutputStream(bo);
            so.writeObject(characterSheet);
            so.flush();

            return bo.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

    private CharacterSheet deserialize(final String serializedObject) {
        try {
            byte b[] = serializedObject.getBytes();
            ByteArrayInputStream bi = new ByteArrayInputStream(b);
            ObjectInputStream si = new ObjectInputStream(bi);

            return (CharacterSheet) si.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
