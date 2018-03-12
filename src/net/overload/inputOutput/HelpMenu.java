package net.overload.inputOutput;

import net.overload.Commons;
import net.overload.InteractiveObject;
import net.overload.inputOutput.commandLine.TextInput;
import net.overload.inputOutput.hud.MessageBox;

public class HelpMenu {
    HelpMenu(){
        InteractiveObject Back = new InteractiveObject("Back", "B", () -> new GameMenu());
        String helpMessage = "Words with an " + Commons.TEXT_UNDERLINE + "underscore" + Commons.ANSI_NORMAL + " are interactive!";

        TextInput input = new TextInput();
        input.addListener(Back);

        MessageBox menu = new MessageBox(
                helpMessage +
                        "\n" +
                        "\n" +
                        Back.toStringln()
        );

        menu.display();
        input.enterKey();
    }
}
