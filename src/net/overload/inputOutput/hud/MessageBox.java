package net.overload.inputOutput.hud;

import net.overload.commons.AnsiEscapeCommands;
import net.overload.inputOutput.commandline.TextOutput;

import java.util.Arrays;

public class MessageBox {
    final StringBuilder messageInBox = new StringBuilder();

    public MessageBox(String message) {
        String[] lines = message.split("\n");

        messageInBox.append(AnsiEscapeCommands.ANSI_COLOR_RED + "╔══════════════════════════════════════════════════════════════════════════════╗\n");
        Arrays.asList(lines).forEach(line -> messageInBox
                .append(AnsiEscapeCommands.ANSI_COLOR_RED + "║")
                .append(AnsiEscapeCommands.ANSI_NORMAL + line)
                .append(AnsiEscapeCommands.ANSI_COLOR_RED + filler(line) + "║\n"));
        messageInBox.append(AnsiEscapeCommands.ANSI_COLOR_RED + "╚══════════════════════════════════════════════════════════════════════════════╝\n");
    }

    public void display(){
        TextOutput.print(messageInBox.toString());
    }

    private String filler(final String line){
        int numberOfEmptySpaces = 80 - (2 + line.replaceAll(AnsiEscapeCommands.REGEX_ANSI_ESCAPE_CODES, "").length());
        StringBuilder emptySpace = new StringBuilder();

        for (int i = 0; i < numberOfEmptySpaces; i++)
            emptySpace.append(" ");

        return emptySpace.toString();
    }
}
