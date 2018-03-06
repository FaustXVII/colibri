package net.overload;

import net.overload.inputOutput.listener.Observer;

public class InteractiveObject extends Observer{
    String objectName;
    String hotKey;


    public InteractiveObject(final String objectName, final String hotKey){
        if (!objectName.contains(hotKey)){
            // throw new Error (Can not set hotKey, because object does not contain the pattern)
        }

        this.objectName = objectName;
        this.hotKey = hotKey;
    }

    @Override
    public String toString() {
        return objectName.replace(hotKey, Commons.TEXT_UNDERLINE + hotKey + Commons.ANSI_NORMAL);
    }

    @Override
    public void update(){
        System.out.println("hello from sword");
    }
}
