package net.overload;

public class InteractiveObject {
    String objectName;
    String hotKey;


    public InteractiveObject(final String objectName, final String hotKey){
        if (!objectName.contains(hotKey)){
            // throw new Error (Can not set hotKey, because object does not contain the pattern)
        }

        this.objectName = objectName;
        this.hotKey = hotKey;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getHotKey() {
        return hotKey;
    }
}
