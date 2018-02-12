package net.overload;

import java.util.Scanner;

public class TextInput {
    Scanner scanner = new Scanner(System.in);

    public String fetchInput(){
        return scanner.next();
    }
}
