package net.overload;

import net.overload.inputOutput.Banner;
import net.overload.inputOutput.MessageBox;
import net.overload.inputOutput.StyledString;

public class Main {

    public static void main(String[] args) {
        Banner.printBanner();

        new MessageBox(
                new StyledString().white("Start"),
                new StyledString().white("Load"),
                new StyledString().white("Tutorial"),
                new StyledString().white(""),
                new StyledString().white("Quit"),
                new StyledString().interactive(new InteractiveObject("Sword", "S"))
        );
    }
}
