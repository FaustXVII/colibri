package net.overload.inputOutput;

import java.util.Scanner;

public class TextInput {
    private final Scanner scanner = new Scanner(System.in);

    public String fetchInput() {
        return scanner.nextLine();
    }

    public int fetchNumberInput(){
        return scanner.nextInt();
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
