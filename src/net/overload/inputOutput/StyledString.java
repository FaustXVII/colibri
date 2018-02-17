package net.overload.inputOutput;

public class StyledString {
    private int length = 0;
    private StringBuilder value = new StringBuilder();

    public StyledString white(String input){
        length += input.length();
        value.append("\033[0m"+ input);

        return this;
    }

    public StyledString underLine(String input){
        length += input.length();
        value.append("\033[4m" + input);

        return this;
    }

    public StyledString red(String input){
        length += input.length();
        value.append("\033[38;5;1m" + input);

        return this;
    }

    public int getLength() {
        return length;
    }

    public String getValue() {
        return value.toString();
    }
}
