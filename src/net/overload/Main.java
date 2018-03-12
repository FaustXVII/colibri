package net.overload;

import net.overload.inputOutput.commandLine.TextInput;
import net.overload.inputOutput.commandLine.TextOutput;
import net.overload.inputOutput.hud.Banner;
import net.overload.inputOutput.hud.MessageBox;

public class Main {
    public static void main(String[] args) {
        TextOutput.clearConsole();
        Banner.printBanner();

        TextInput input = new TextInput();
        InteractiveObject start = new InteractiveObject("Start", "S", () -> System.out.println("Start!"));
        InteractiveObject load = new InteractiveObject("Load", "L", () -> System.out.println("Load!"));
        InteractiveObject tutorial = new InteractiveObject("Tutorial", "T", () -> System.out.println("Tutorial!"));
        InteractiveObject quit = new InteractiveObject("Quit", "Q", () -> System.out.println("Quit!"));

        input.addListener(start);
        input.addListener(load);
        input.addListener(tutorial);
        input.addListener(quit);

        MessageBox menu = new MessageBox(
               start.toStringln() +
               load.toStringln()+
               tutorial.toStringln()+
               "\n"+
               quit.toStringln()
        );

        menu.display();
        input.enterKey();
    }
}
