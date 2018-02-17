package net.overload;

public class commons {
    public static String boxTopBorder(){
        return redText("╔══════════════════════════════════════════════════════════════════════════════╗");
    }

    public static String boxBottomBorder(){
        return redText("╚══════════════════════════════════════════════════════════════════════════════╝");
    }

    public static String redText(final String input){
        return "\033[38;5;1m" + input + "\033[0m";
    }
}
