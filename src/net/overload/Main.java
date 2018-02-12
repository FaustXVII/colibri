package net.overload;

public class Main {

    public static void main(String[] args) {
        TextInput input = new TextInput();
        TextOutput output = new TextOutput();

        output.displayTextOutput("Enter your name: ");
        output.displayTextOutput("Hello " + input.fetchInput() + "!");
    }
}
