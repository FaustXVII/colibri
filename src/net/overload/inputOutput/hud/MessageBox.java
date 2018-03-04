package net.overload.inputOutput.hud;

import net.overload.Commons;
import net.overload.inputOutput.commandLine.TextInput;
import net.overload.inputOutput.commandLine.TextOutput;

import java.util.Arrays;

public class MessageBox {
    TextInput input = new TextInput();

    public MessageBox(String message) {
        String[] lines = message.split("\n");

        StringBuilder sb = new StringBuilder();
        sb.append(Commons.ANSI_COLOR_RED + "╔══════════════════════════════════════════════════════════════════════════════╗\n");

        Arrays.asList(lines).forEach(line -> sb
                .append(Commons.ANSI_COLOR_RED + "║")
                .append(Commons.ANSI_NORMAL + line)
                .append(Commons.ANSI_COLOR_RED + filler(line) + "║\n"));

        sb.append(Commons.ANSI_COLOR_RED + "╚══════════════════════════════════════════════════════════════════════════════╝\n");
        sb.append(Commons.ANSI_NORMAL + "> ");

        TextOutput.print(sb.toString());
        input.fetchInput();
    }

    private String filler(final String line){
        int numberOfEmptySpaces = 80 - (2 + line.replaceAll(Commons.REGEX_ANSI_ESCAPE_CODES, "").length());
        StringBuilder emptySpace = new StringBuilder();

        for (int i = 0; i < numberOfEmptySpaces; i++) {
            emptySpace.append(" ");
        }

        return emptySpace.toString();
    }
}
