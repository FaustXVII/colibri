package net.overload.menus;

import net.overload.CharacterSheet;
import net.overload.inputOutput.file.SaveFile;

public class NewCharacter {
    public NewCharacter() {
        SaveFile saveFile = new SaveFile();
        saveFile.CharacterSheetToFile(new CharacterSheet());
        saveFile.fileToCharacterSheet();
    }
}
