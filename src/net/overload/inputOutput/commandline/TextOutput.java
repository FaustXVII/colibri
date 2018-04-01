package net.overload.inputOutput.commandline;

import net.overload.commons.AnsiEscapeCommands;

public class TextOutput {
    public static void print(final String printMessage) {
        System.out.print(printMessage);
    }

    public static void clearConsole() {
        System.out.print(AnsiEscapeCommands.ANSI_CLS + AnsiEscapeCommands.ANSI_HOME);
        System.out.flush();
    }
}
