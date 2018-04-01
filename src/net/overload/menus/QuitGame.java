package net.overload.menus;

import net.overload.inputOutput.commandline.TextInput;
import net.overload.inputOutput.hud.MessageBox;

public class QuitGame {
    QuitGame(){
        MessageBox menu = new MessageBox("Are you sure you want to Quit?\n[Y/n]");
        menu.display();

        TextInput input = new TextInput();
        if (input.confirm()){
            MessageBox goodBye = new MessageBox("Good bye!");
            goodBye.display();
            System.exit(0);
        }else {
            new GameMenu();
        }
    }
}
