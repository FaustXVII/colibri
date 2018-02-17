package net.overload.inputOutput;

import java.util.Arrays;

public class MessageBox {
    TextInput input = new TextInput();

    public MessageBox(StyledString... lines) {
        StyledString ss = new StyledString();
        ss.red("╔══════════════════════════════════════════════════════════════════════════════╗\n");
        Arrays.asList(lines).forEach(line -> ss.red("║").white(line.getValue()).red(filler(line) + "║\n"));
        ss.red("╚══════════════════════════════════════════════════════════════════════════════╝\n");
        ss.white("> ");

        System.out.print(ss.getValue());
        input.fetchInput();
    }

    private String filler(final StyledString styledString) {
        int numberOfEmptySpaces = 80 - (2 + styledString.getLength());
        StringBuilder emptySpace = new StringBuilder();

        for (int i = 0; i < numberOfEmptySpaces; i++) {
            emptySpace.append(" ");
        }

        return emptySpace.toString();
    }
}