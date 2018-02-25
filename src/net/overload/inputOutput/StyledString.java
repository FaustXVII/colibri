package net.overload.inputOutput;

import net.overload.InteractiveObject;

public class StyledString {
    private static final String TEXT_NORMAL = "\033[0m";
    private static final String TEXT_COLOR_RED = "\033[38;5;1m";
    private static final String TEXT_UNDERLINE = "\033[4m" ;

    private int length = 0;
    private StringBuilder value = new StringBuilder();

    public StyledString white(String input){
        length += input.length();
        value.append(TEXT_NORMAL + input);

        return this;
    }

    public StyledString red(String input){
        length += input.length();
        value.append(TEXT_COLOR_RED + input);

        return this;
    }

    public StyledString interactive(final InteractiveObject interactiveObject){
        final String objectName =  interactiveObject.getObjectName();
        length += objectName.length();
        final String hotKey = interactiveObject.getHotKey();

        value.append(objectName.replace(hotKey, TEXT_UNDERLINE+ hotKey + TEXT_NORMAL));

        return this;
    }

    public int getLength() {
        return length;
    }

    public String getValue() {
        return value.toString();
    }
}
