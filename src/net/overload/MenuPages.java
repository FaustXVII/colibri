package net.overload;

import net.overload.inputOutput.TextOutput;

import static net.overload.commons.*;

public class MenuPages {
    TextOutput output = new TextOutput();

    public void displayGameTitle(){
        output.displayTextOutput("OverloadGames.net (c)");
        output.displayTextOutput("V0.0.1-a");
        output.displayTextOutput("Old scrolls, an Overload Story");
        output.displayTextOutput("Watch out! Mimics!\n\n\n\n\n");
        output.displayTextOutput(redText( // http://patorjk.com/software/taag/#p=display&f=Bloody&t=Colibri
                " ▒█████   ██▓    ▓█████▄      ██████  ▄████▄   ██▀███   ▒█████   ██▓     ██▓    \n" +
                        "▒██▒  ██▒▓██▒    ▒██▀ ██▌   ▒██    ▒ ▒██▀ ▀█  ▓██ ▒ ██▒▒██▒  ██▒▓██▒    ▓██▒    \n" +
                        "▒██░  ██▒▒██░    ░██   █▌   ░ ▓██▄   ▒▓█    ▄ ▓██ ░▄█ ▒▒██░  ██▒▒██░    ▒██░    \n" +
                        "▒██   ██░▒██░    ░▓█▄   ▌     ▒   ██▒▒▓▓▄ ▄██▒▒██▀▀█▄  ▒██   ██░▒██░    ▒██░    \n" +
                        "░ ████▓▒░░██████▒░▒████▓    ▒██████▒▒▒ ▓███▀ ░░██▓ ▒██▒░ ████▓▒░░██████▒░██████▒\n" +
                        "░ ▒░▒░▒░ ░ ▒░▓  ░ ▒▒▓  ▒    ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▓  ░░ ▒░▓  ░\n" +
                        "  ░ ▒ ▒░ ░ ░ ▒  ░ ░ ▒  ▒    ░ ░▒  ░ ░  ░  ▒     ░▒ ░ ▒░  ░ ▒ ▒░ ░ ░ ▒  ░░ ░ ▒  ░\n" +
                        "░ ░ ░ ▒    ░ ░    ░ ░  ░    ░  ░  ░  ░          ░░   ░ ░ ░ ░ ▒    ░ ░     ░ ░   \n" +
                        "    ░ ░      ░  ░   ░             ░  ░ ░         ░         ░ ░      ░  ░    ░  ░\n" +
                        "                  ░                  ░                                          "));
    }

    public void displayMainMenu(){
        output.displayTextOutput(boxTopBorder());
        output.displayTextOutputInnerBox(underline("N") + "ew game");
        output.displayTextOutputInnerBox(redText("Load game"));
        output.displayTextOutputInnerBox("");
        output.displayTextOutputInnerBox(blink("Quit game"));
        output.displayTextOutput(boxBottumBorder());
    }
}
