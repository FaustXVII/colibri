package net.overload;

import net.overload.inputOutput.GameMenu;
import net.overload.inputOutput.commandLine.TextOutput;
import net.overload.inputOutput.hud.Banner;

public class Main {
    public static void main(String[] args) {
        TextOutput.clearConsole();
        Banner.printBanner();
        new GameMenu();
    }
}
