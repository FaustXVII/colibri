package net.overload.inputOutput.hud;

import net.overload.Commons;
import net.overload.inputOutput.StyledString;
import net.overload.inputOutput.commandLine.TextInput;
import net.overload.inputOutput.commandLine.TextOutput;

import java.util.Arrays;

public class MessageBox {
    TextInput input = new TextInput();

    public MessageBox(StyledString styledString) {
        String[] lines = styledString.getValue().split("\n");

        StyledString ss = new StyledString();
        ss.red("╔══════════════════════════════════════════════════════════════════════════════╗\n");
        Arrays.asList(lines).forEach(line -> ss.red("║").white(line).red(filler(line) + "║\n"));
        ss.red("╚══════════════════════════════════════════════════════════════════════════════╝\n");
        ss.white("> ");

        TextOutput.print(ss.getValue());
        input.fetchInput();
    }

    private String filler(final String styledString) {
        int numberOfEmptySpaces = 80 - (2 + styledString.replaceAll(Commons.REGEX_ANSI_ESCAPE_CODES, "").length());
        StringBuilder emptySpace = new StringBuilder();

        for (int i = 0; i < numberOfEmptySpaces; i++) {
            emptySpace.append(" ");
        }

        return emptySpace.toString();
    }
}
