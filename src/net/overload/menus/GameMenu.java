package net.overload.menus;

import net.overload.chapters.chapter1.StartPosition;
import net.overload.domain.InteractiveObject;
import net.overload.inputOutput.commandline.TextInput;
import net.overload.inputOutput.hud.MessageBox;

public class GameMenu {
    public GameMenu() {
        InteractiveObject start = new InteractiveObject("Start", "S", () -> new StartPosition());
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
