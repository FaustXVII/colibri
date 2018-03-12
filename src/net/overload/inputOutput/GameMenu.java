package net.overload.inputOutput;

import net.overload.InteractiveObject;
import net.overload.inputOutput.commandLine.TextInput;
import net.overload.inputOutput.hud.MessageBox;

public class GameMenu {
    public GameMenu() {
        InteractiveObject start = new InteractiveObject("Start", "S", () -> System.out.println("Start!"));
        InteractiveObject load = new InteractiveObject("Load", "L", () -> System.out.println("Load!"));
        InteractiveObject help = new InteractiveObject("Help?", "?", () -> new HelpMenu());
        InteractiveObject quit = new InteractiveObject("Quit", "Q", () -> new QuitGame());

        TextInput input = new TextInput();
        input.addListener(start);
        input.addListener(load);
        input.addListener(help);
        input.addListener(quit);

        MessageBox menu = new MessageBox(
                start.toStringln() +
                        load.toStringln() +
                        help.toStringln() +
                        "\n" +
                        quit.toStringln()
        );

        menu.display();
        input.enterKey();
    }
}
