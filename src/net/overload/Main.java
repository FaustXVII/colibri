package net.overload;

import net.overload.menus.GameMenu;
import net.overload.inputOutput.commandline.TextOutput;
import net.overload.inputOutput.hud.Banner;

public class Main {
    public static void main(String[] args) {
        TextOutput.clearConsole();
        Banner.printBanner();
        new GameMenu();
    }
}
