package net.overload.menus;

import net.overload.inputOutput.file.SaveFile;

public class NewCharacter {
    public NewCharacter() {
        SaveFile saveFile = new SaveFile();
        saveFile.save();
        saveFile.load();
    }
}
