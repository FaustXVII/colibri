package net.overload.inputOutput.hud;

import net.overload.commons.AnsiEscapeCommands;
import net.overload.inputOutput.commandline.TextOutput;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Banner {
    private static final String STATIC_BANNER = // http://patorjk.com/software/taag/#p=display&f=Bloody&t=Colibri
                " ▒█████   ██▓    ▓█████▄      ██████  ▄████▄   ██▀███   ▒█████   ██▓     ██▓    \n" +
                "▒██▒  ██▒▓██▒    ▒██▀ ██▌   ▒██    ▒ ▒██▀ ▀█  ▓██ ▒ ██▒▒██▒  ██▒▓██▒    ▓██▒    \n" +
                "▒██░  ██▒▒██░    ░██   █▌   ░ ▓██▄   ▒▓█    ▄ ▓██ ░▄█ ▒▒██░  ██▒▒██░    ▒██░    \n" +
                "▒██   ██░▒██░    ░▓█▄   ▌     ▒   ██▒▒▓▓▄ ▄██▒▒██▀▀█▄  ▒██   ██░▒██░    ▒██░    \n" +
                "░ ████▓▒░░██████▒░▒████▓    ▒██████▒▒▒ ▓███▀ ░░██▓ ▒██▒░ ████▓▒░░██████▒░██████▒\n" +
                "░ ▒░▒░▒░ ░ ▒░▓  ░ ▒▒▓  ▒    ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▓  ░░ ▒░▓  ░\n" +
                "  ░ ▒ ▒░ ░ ░ ▒  ░ ░ ▒  ▒    ░ ░▒  ░ ░  ░  ▒     ░▒ ░ ▒░  ░ ▒ ▒░ ░ ░ ▒  ░░ ░ ▒  ░\n" +
                "░ ░ ░ ▒    ░ ░    ░ ░  ░    ░  ░  ░  ░          ░░   ░ ░ ░ ░ ▒    ░ ░     ░ ░   \n" +
                "    ░ ░      ░  ░   ░             ░  ░ ░         ░         ░ ░      ░  ░    ░  ░\n" +
                "                  ░                  ░                                          \n";

    private static final String BANNER_FRAME_1 =
                " ▒█████   ██▓    ▓█████▄      ██████  ▄████▄   ██▀███   ▒█████   ██▓     ██▓    \n" +
                "▒██▒  ██▒▓██▒    ▒██▀ ██▌   ▒██    ▒ ▒██▀ ▀█  ▓██ ▒ ██▒▒██▒  ██▒▓██▒    ▓██▒    \n" +
                "▒██░  ██▒▒██░    ░██   █▌   ░ ▓██▄   ▒▓█    ▄ ▓██ ░▄█ ▒▒██░  ██▒▒██░    ▒██░    \n" +
                "▒██   ██░▒██░    ░▓█▄   ▌     ▒   ██▒▒▓▓▄ ▄██▒▒██▀▀█▄  ▒██   ██░▒██░    ▒██░    \n" +
                "░ ████▓▒░░██████▒░▒████▓    ▒██████▒▒▒ ▓███▀ ░░██▓ ▒██▒░ ████▓▒░░██████▒░██████▒\n" +
                "░ ▒░▒░░█ ░ ▒░▓  ░ ▒▒▓  ▒    ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░░ ▒▓ ░▒▓░░ ░█▒░▒░ ░ ▒░ █ ░░ ▒░▓  ░\n" +
                "  ░ ▒ ▒░ ░ ░  █ ░ ░ ▒  ▒    ░ ░▒  ░  █ ░  ▒     ░▒ ░ ▒░  ░ ▒ ▒░ ░ ░ ▒  ░░ ░ ▒  ░\n" +
                "░ ░ ░ ▒    ░ ░    ░ ░  ░    ░  ░  ░  ░          ░░   ░ ░ ░ ░ ▒    ░ ░     ░ ░   \n" +
                "    ░ ░      ░  ░   ░             ░  ░ ░         ░         ░ ░      ░  ░    ░  ░\n" +
                "                  ░                  ░                                          \n";

 private static final String BANNER_FRAME_2 =
                " ▒█████   ██▓    ▓█████▄      ██████  ▄████▄   ██▀███   ▒█████   ██▓     ██▓    \n" +
                "▒██▒  ██▒▓██▒    ▒██▀ ██▌   ▒██    ▒ ▒██▀ ▀█  ▓██ ▒ ██▒▒██▒  ██▒▓██▒    ▓██▒    \n" +
                "▒██░  ██▒▒██░    ░██   █▌   ░ ▓██▄   ▒▓█    ▄ ▓██ ░▄█ ▒▒██░  ██▒▒██░    ▒██░    \n" +
                "▒██   ██░▒██░    ░▓█▄   ▌     ▒   ██▒▒▓▓▄ ▄██▒▒██▀▀█▄  ▒██   ██░▒██░    ▒██░    \n" +
                "░ ████▓▒░░██████▒░▒████▓    ▒██████▒▒▒ ▓███▀ ░░██▓ ▒██▒░ ████▓▒░░██████▒░██████▒\n" +
                "░ ▒░▒░▒░ ░ ▒░▓  ░ ▒▒▓  ▒    ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▓  ░░ ▒░▓  ░\n" +
                "  ░ ▒ ▒ █░ ░ ▒  ░ ░ ▒  ▒    ░ ░▒  ░ ░  ░  ▒     ░▒ ░ ▒░  ░▒█ ▒░ ░ ░ ▒  ░░ ░ ▒  ░\n" +
                "░ ░ ░ ▒    ░ ░    ░ ░  ░    ░  ░  ░   █         ░░   ░ ░ ░ ░ ▒    ░ ░  █  ░ ░   \n" +
                "    ░ ░      ░ ░█   ░             ░  ░ ░         ░         ░ ░      ░  ░    ░  ░\n" +
                "                  ░                  ░                                          \n";

 private static final String BANNER_FRAME_3 =
                " ▒█████   ██▓    ▓█████▄      ██████  ▄████▄   ██▀███   ▒█████   ██▓     ██▓    \n" +
                "▒██▒  ██▒▓██▒    ▒██▀ ██▌   ▒██    ▒ ▒██▀ ▀█  ▓██ ▒ ██▒▒██▒  ██▒▓██▒    ▓██▒    \n" +
                "▒██░  ██▒▒██░    ░██   █▌   ░ ▓██▄   ▒▓█    ▄ ▓██ ░▄█ ▒▒██░  ██▒▒██░    ▒██░    \n" +
                "▒██   ██░▒██░    ░▓█▄   ▌     ▒   ██▒▒▓▓▄ ▄██▒▒██▀▀█▄  ▒██   ██░▒██░    ▒██░    \n" +
                "░ ████▓▒░░██████▒░▒████▓    ▒██████▒▒▒ ▓███▀ ░░██▓ ▒██▒░ ████▓▒░░██████▒░██████▒\n" +
                "░ ▒░▒░▒░ ░ ▒░▓  ░ ▒▒▓  ▒    ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▓  ░░ ▒░▓  ░\n" +
                "  ░ ▒ ▒░ ░ ░ ▒  ░ ░ ▒  ▒    ░ ░▒  ░ ░  ░  ▒     ░▒ ░ ▒░  ░ ▒ ▒░ ░ ░ ▒  ░░ ░ ▒  ░\n" +
                "░ ░ ░ ▒  █ ░ ░    ░ ░  ░    ░  ░  ░  ░          ░░   ░ ░ ░ ░ ▒    ░ ░     ░ ░   \n" +
                "    ░ ░      ░  ░   ░             ░  ░ ░         ░          █░      ░   █   ░  ░\n" +
                "                 ░█                  ░ █                                        \n";

 private static final String BANNER_FRAME_4 =
                " ▒█████   ██▓    ▓█████▄      ██████  ▄████▄   ██▀███   ▒█████   ██▓     ██▓    \n" +
                "▒██▒  ██▒▓██▒    ▒██▀ ██▌   ▒██    ▒ ▒██▀ ▀█  ▓██ ▒ ██▒▒██▒  ██▒▓██▒    ▓██▒    \n" +
                "▒██░  ██▒▒██░    ░██   █▌   ░ ▓██▄   ▒▓█    ▄ ▓██ ░▄█ ▒▒██░  ██▒▒██░    ▒██░    \n" +
                "▒██   ██░▒██░    ░▓█▄   ▌     ▒   ██▒▒▓▓▄ ▄██▒▒██▀▀█▄  ▒██   ██░▒██░    ▒██░    \n" +
                "░ ████▓▒░░██████▒░▒████▓    ▒██████▒▒▒ ▓███▀ ░░██▓ ▒██▒░ ████▓▒░░██████▒░██████▒\n" +
                "░ ▒░▒░▒░ ░ ▒░▓  ░ ▒▒▓  ▒    ▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▓  ░░ ▒░▓  ░\n" +
                "  ░ ▒ ▒░ ░ ░ ▒  ░ ░ ▒  ▒    ░ ░▒  ░ ░  ░  ▒     ░▒ ░ ▒░  ░ ▒ ▒░ ░ ░ ▒  ░░ ░ ▒  ░\n" +
                "░ ░ ░ ▒    ░ ░    ░ ░  ░    ░  ░  ░  ░          ░░   ░ ░ ░ ░ ▒    ░ ░     ░ ░   \n" +
                "    ░ ░      ░  ░   ░             ░  ░ ░         ░         ░ ░      ░  ░    ░  ░\n" +
                "          █       ░                  ░                      █                   \n";

 private static final String[] FRAMES = {STATIC_BANNER, BANNER_FRAME_1, BANNER_FRAME_2, BANNER_FRAME_3, BANNER_FRAME_4};


    public static void printBanner(){
        TextOutput.print(AnsiEscapeCommands.ANSI_COLOR_RED + STATIC_BANNER + AnsiEscapeCommands.ANSI_NORMAL);
    }

    public static void StartAnimatedBanner(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            try {
                int i = 0;
                while (true){
                    TimeUnit.SECONDS.sleep(1);
                    TextOutput.print("\r");
                    TextOutput.print(AnsiEscapeCommands.ANSI_COLOR_RED + FRAMES[i++ % FRAMES.length]);
                    TextOutput.print(AnsiEscapeCommands.ansiCursorUp(10));
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
    }
}
