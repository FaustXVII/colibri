package net.overload;

import net.overload.creatures.Player;

public class Main {

    public static void main(String[] args) {
        new MenuPages().displayGameTitle();
        new MenuPages().displayMainMenu();

        Player player = new Player();
        player.createNewPlayer();
    }
}
