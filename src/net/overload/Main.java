package net.overload;

import net.overload.inputOutput.commandLine.TextInput;
import net.overload.inputOutput.hud.Banner;
import net.overload.inputOutput.hud.MessageBox;
import net.overload.inputOutput.listener.Subject;

public class Main {

    public static void main(String[] args) {
        Banner.printBanner();


        Subject subject = new Subject();
        TextInput input = new TextInput();
        InteractiveObject sword = new InteractiveObject("Sword", "S");
        subject.attach(sword);
        subject.setEnteredValue(input.fetchInput());



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
