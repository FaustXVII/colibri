package net.overload.inputOutput.commandLine;

import net.overload.inputOutput.listener.Listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextInput {
    private final Scanner scanner = new Scanner(System.in);
    private List<Listener> listeners = new ArrayList<>();

    public void enterKey() {
        listeners.forEach(l -> l.inputEvent(scanner.nextLine().toLowerCase()));
    }

    public void addListener(final Listener listener){
        listeners.add(listener);
    }

    public boolean confirm() {
        switch (scanner.nextLine().toLowerCase()) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                return confirm();
        }
    }
}
