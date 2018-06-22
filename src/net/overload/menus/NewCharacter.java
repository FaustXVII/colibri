package net.overload.menus;

import net.overload.CharacterSheet;
import net.overload.inputOutput.file.SaveToFile;

public class NewCharacter {
    public NewCharacter() {
        SaveToFile saveFile = new SaveToFile();
        saveFile.CharacterSheetToFile(new CharacterSheet());
        saveFile.fileToCharacterSheet();
    }
}
