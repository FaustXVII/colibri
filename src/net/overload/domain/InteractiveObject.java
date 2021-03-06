package net.overload.domain;

import net.overload.commons.AnsiEscapeCommands;
import net.overload.inputOutput.listener.UpdateEvent;
import net.overload.inputOutput.listener.Listener;

public class InteractiveObject implements Listener {
    private final String objectName;
    private final String hotKey;
    private final UpdateEvent event;


    public InteractiveObject(final String objectName, final String hotKey, final UpdateEvent event) {
        if (!objectName.contains(hotKey)) {
            // throw new Error (Can not set hotKey, because object does not contain the pattern)
        }
        this.event = event;
        this.objectName = objectName;
        this.hotKey = hotKey;
    }

    @Override
    public String toString() {
        return objectName.replace(hotKey, AnsiEscapeCommands.ANSI_UNDERLINE + hotKey + AnsiEscapeCommands.ANSI_NORMAL);
    }

    public String toStringln(){
        return toString() + "\n";
    }

    @Override
    public void inputEvent(final String input) {
        if (hotKey.toLowerCase().equals(input))
            event.Update();
    }
}
