package net.overload;

import net.overload.inputOutput.hud.Banner;
import net.overload.inputOutput.hud.MessageBox;

public class Main {

    public static void main(String[] args) {
        Banner.printBanner();

        new MessageBox(
                "Strat\n" +
                        "Load\n" +
                        "Tutorial\n" +
                        "\n" +
                        "Quit\n" +
                        new InteractiveObject("Sword", "S").toString()
        );
    }
}
