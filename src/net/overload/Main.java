package net.overload;

import net.overload.inputOutput.hud.Banner;
import net.overload.inputOutput.hud.MessageBox;
import net.overload.inputOutput.StyledString;

public class Main {

    public static void main(String[] args) {
        Banner.printBanner();

        new MessageBox(
                new StyledString().white("Start\n")
                .white("Load\n")
                .white("Tutorial\n")
                .white("\n")
                .white("Quit\n")
                .interactive(new InteractiveObject("Sword", "S"))
        );
    }
}
