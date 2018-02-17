package net.overload.inputOutput;

import static net.overload.commons.*;

public class TextOutput {
    public void displayTextOutput(final String output) {
        System.out.println(output);
    }

    public void displayTextOutputInnerBox(final String output) {
        int numberOfEmptySpaces = 80;
        StringBuilder emptySpace = new StringBuilder();
        for (int i = 0; i < numberOfEmptySpaces; i++) {
            emptySpace.append(" ");
        }

        displayTextOutput(redText("║ ") + output);
    }

    public void displayTextOutputInline(final String output) {
        System.out.print(output);
    }


    // Spinner
    // new thread
    //Sleep -> print("\r|")
    //Sleep -> print("\r/")
    //Sleep -> print("\r-")
    //Sleep -> print("\r\")
}
