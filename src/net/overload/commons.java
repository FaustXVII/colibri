package net.overload;

public class commons {
    public static String boxTopBorder(){
        return redText("╔══════════════════════════════════════════════════════════════════════════════╗");
    }

    public static String boxBottumBorder(){
        return redText("╚══════════════════════════════════════════════════════════════════════════════╝");
    }

    public static String underline(final String input){
        return "\033[4m" + input + "\033[0m";
    }

    public static String blink(final String input){
        return "\033[5m" + input + "\033[0m";
    }

    public static String redText(final String input){
        return "\033[38;5;1m" + input + "\033[0m";
    }
}
