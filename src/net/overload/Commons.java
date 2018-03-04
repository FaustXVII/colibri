package net.overload;

public class Commons {
    public static final String ANSI_NORMAL = "\033[0m";
    public static final String ANSI_COLOR_RED = "\033[38;5;1m";
    public static final String TEXT_UNDERLINE = "\033[4m" ;
    public static final String ANSI_CLS = "\u001b[2J";
    public static final String ANSI_HOME = "\u001b[H";

    public static final String ANSI_SAVE_CURSOR_POSITION = "\033[s";
    public static final String ANSI_LOAD_CURSOR_POSITION = "\033[u";

    public static final String REGEX_ANSI_ESCAPE_CODES = "\\033\\[[0-9;]*m";

    public static String ansiCursorUp(final int numberOfRows){
        return (numberOfRows > 0)? ("\033[" + numberOfRows + "A") : (ansiCursorDown(numberOfRows * -1));
    }

    public static String ansiCursorDown(final int numberOfRows){
        return (numberOfRows > 0)? ("\033[" + numberOfRows + "B") : (ansiCursorUp(numberOfRows * -1));
    }
}
