package net.overload.inputOutput.commandLine;

import net.overload.Commons;
import net.overload.inputOutput.listener.Listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextInput {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Listener> listeners = new ArrayList<>();

    public void enterKey() {
        while (true) {
            commandLineCursor();
            final String input = scanner.nextLine().toLowerCase();

            listeners.forEach(l -> l.inputEvent(input));
        }
    }

    public void addListener(final Listener listener) {
        listeners.add(listener);
    }

    public boolean confirm() {
        commandLineCursor();
        switch (scanner.nextLine().toLowerCase()) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                return confirm();
        }
    }

    private void commandLineCursor(){
        TextOutput.print(Commons.ANSI_NORMAL + "> ");
    }
}
