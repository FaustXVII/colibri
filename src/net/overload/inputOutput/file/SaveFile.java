package net.overload.inputOutput.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveFile {
    private static final String FILE_NAME = "./savefile.txt";

    public void save() {
        try (PrintWriter printWriter = new PrintWriter(FILE_NAME)) {
            printWriter.print("Woop woop woop");
        } catch (final FileNotFoundException exception) {
            throw new RuntimeException("Could not save, file not found: " + exception);
        }
    }

    public void load() {
        File file = new File(FILE_NAME);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String bob = bufferedReader.readLine();
            System.out.print(bob);

        } catch (final FileNotFoundException exception) {
            throw new RuntimeException("Could not load, file not found: " + exception);
        } catch (final IOException exception) {
            throw new RuntimeException("Could not load, I/O problem: " + exception);
        }
    }

    private void serialize() {

    }

    private void deserialize() {

    }
}
