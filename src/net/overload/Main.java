package net.overload;

import net.overload.inputOutput.commandLine.TextOutput;
import net.overload.inputOutput.hud.Banner;
import net.overload.inputOutput.hud.MessageBox;
import net.overload.inputOutput.StyledString;

public class Main {

    public static void main(String[] args) {
        Banner.printBanner();

        new MessageBox(// write a generator example "Start\n<red>name</red>\n"+ sword +" more more"
                new StyledString().white("Start"),
                new StyledString().white("Load"),
                new StyledString().white("Tutorial"),
                new StyledString().white(""),
                new StyledString().white("Quit"),
                new StyledString().interactive(new InteractiveObject("Sword", "S"))
        );

        TextOutput.clearConsole();
        Banner.printBanner();
    }
}
