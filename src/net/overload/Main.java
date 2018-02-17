package net.overload;

import net.overload.creatures.Player;
import net.overload.inputOutput.Box;
import net.overload.inputOutput.StyledString;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new MenuPages().displayGameTitle();// Maybe add this as header above every single Box
        new MenuPages().displayMainMenu();


        List<StyledString> styledLines = new ArrayList<>();
        styledLines.add(new StyledString().white("test"));
        styledLines.add(new StyledString().white("new line"));
        styledLines.add(new StyledString().white(""));
        styledLines.add(new StyledString().white("Last line with under-line"));

        new Box(styledLines);

        Player player = new Player();
        player.createNewPlayer();
    }
}
