package net.overload.inputOutput;

import net.overload.Commons;
import net.overload.InteractiveObject;

public class StyledString {
    private int length = 0;
    private StringBuilder value = new StringBuilder();

    public StyledString white(String input){
        length += input.length();
        value.append(Commons.TEXT_NORMAL + input);

        return this;
    }

    public StyledString red(String input){
        length += input.length();
        value.append(Commons.TEXT_COLOR_RED + input);

        return this;
    }

    public StyledString interactive(final InteractiveObject interactiveObject){
        final String objectName =  interactiveObject.getObjectName();
        length += objectName.length();
        final String hotKey = interactiveObject.getHotKey();

        value.append(objectName.replace(hotKey, Commons.TEXT_UNDERLINE+ hotKey + Commons.TEXT_NORMAL));

        return this;
    }

    public int getLength() {
        return length;
    }

    public String getValue() {
        return value.toString();
    }
}
