package net.overload.inputOutput;

import net.overload.Commons;

public class Banner {
    public static void printBanner(){
        TextOutput.print(Commons.TEXT_COLOR_RED +  // http://patorjk.com/software/taag/#p=display&f=Bloody&t=Colibri
                " ▒█████   ██▓    ▓█████▄      ██████  ▄████▄   ██▀███   ▒█████   ██▓     ██▓    \n" +
                "▒██▒  ██▒▓██▒    ▒██▀ ██▌   ▒██    ▒ ▒██▀ ▀█  ▓██ ▒ ██▒▒██▒  ██▒▓██▒    ▓██▒    \n" +
                "▒██░  ██▒▒██░    ░██   █▌   ░ ▓██▄   ▒▓█    ▄ ▓██ ░▄█ ▒▒██░  ██▒▒██░    ▒██░    \n" +
                "▒██   ██░▒██░    ░▓█▄   ▌     ▒   ██▒▒▓▓▄ ▄██▒▒██▀▀█▄  ▒██   ██░▒██░    ▒██░    \n" +
                "░ ████▓▒░░██████▒░▒████▓    ▒██████▒▒▒ ▓███▀ ░░██▓ ▒██▒░ ████▓▒░░██████▒░██████▒\n" +
                "░ ▒░▒░▒░ ░ ▒░▓  ░ ▒▒▓  ▒    ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▓  ░░ ▒░▓  ░\n" +
                "  ░ ▒ ▒░ ░ ░ ▒  ░ ░ ▒  ▒    ░ ░▒  ░ ░  ░  ▒     ░▒ ░ ▒░  ░ ▒ ▒░ ░ ░ ▒  ░░ ░ ▒  ░\n" +
                "░ ░ ░ ▒    ░ ░    ░ ░  ░    ░  ░  ░  ░          ░░   ░ ░ ░ ░ ▒    ░ ░     ░ ░   \n" +
                "    ░ ░      ░  ░   ░             ░  ░ ░         ░         ░ ░      ░  ░    ░  ░\n" +
                "                  ░                  ░                                          " +
                Commons.TEXT_NORMAL);
    }
}
