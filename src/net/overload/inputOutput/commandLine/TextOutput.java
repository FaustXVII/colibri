package net.overload.inputOutput.commandLine;

public class TextOutput {
    public static void print(final String printMessage) {
        System.out.print(printMessage);
    }

    public static void clearConsole() {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";

        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }
}
