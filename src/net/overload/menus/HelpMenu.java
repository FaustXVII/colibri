package net.overload.menus;

import net.overload.commons.AnsiEscapeCommands;
import net.overload.domain.InteractiveObject;
import net.overload.inputOutput.commandline.TextInput;
import net.overload.inputOutput.hud.MessageBox;

public class HelpMenu {
    HelpMenu(){
        InteractiveObject Back = new InteractiveObject("Back", "B", () -> new GameMenu());
        String helpMessage = "Words with an " + AnsiEscapeCommands.ANSI_UNDERLINE + "underscore" + AnsiEscapeCommands.ANSI_NORMAL + " are interactive!";

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
