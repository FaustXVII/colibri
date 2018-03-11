package net.overload;

import net.overload.inputOutput.commandLine.TextInput;
import net.overload.inputOutput.hud.Banner;
import net.overload.inputOutput.hud.MessageBox;

public class Main {
    public static void main(String[] args) {
        Banner.printBanner();

        TextInput input = new TextInput();
        InteractiveObject sword = new InteractiveObject("Sword", "S", () -> System.out.println("Lambda Woop woop!!"));
        input.addListener(sword);
        input.enterKey();

        new MessageBox(
                "Strat\n" +
                        "Load\n" +
                        "Tutorial\n" +
                        "\n" +
                        "Quit\n" +
                        sword.toString()
        );
    }
}
