package net.overload;

import net.overload.inputOutput.MessageBox;
import net.overload.inputOutput.MenuPages;
import net.overload.inputOutput.StyledString;

public class Main {

    public static void main(String[] args) {
        new MenuPages().displayGameTitle();// Maybe add this as header above every single MessageBox

        new MessageBox(
                new StyledString().white("Start"),
                new StyledString().white("Load"),
                new StyledString().white("Tutorial"),
                new StyledString().white(""),
                new StyledString().white("Quit")
        );
    }
}
