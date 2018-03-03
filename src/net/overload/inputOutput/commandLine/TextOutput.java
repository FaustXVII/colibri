package net.overload.inputOutput.commandLine;

import net.overload.Commons;

public class TextOutput {
    public static void print(final String printMessage) {
        System.out.print(printMessage);
    }

    public static void clearConsole() {
        System.out.print(Commons.ANSI_CLS + Commons.ANSI_HOME);
        System.out.flush();
    }
}
