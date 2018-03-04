package net.overload.inputOutput;

import net.overload.Commons;
import net.overload.InteractiveObject;

public class StyledString {
    private StringBuilder value = new StringBuilder();

    public StyledString white(String input){
        value.append(Commons.ANSI_NORMAL + input);

        return this;
    }

    public StyledString red(String input){
        value.append(Commons.ANSI_COLOR_RED + input);

        return this;
    }

    public StyledString interactive(final InteractiveObject interactiveObject){
        final String objectName =  interactiveObject.getObjectName();
        final String hotKey = interactiveObject.getHotKey();

        value.append(objectName.replace(hotKey, Commons.TEXT_UNDERLINE+ hotKey + Commons.ANSI_NORMAL));

        return this;
    }

    public String getValue() {
        return value.toString();
    }
}
