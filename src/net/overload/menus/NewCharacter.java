package net.overload.menus;

import net.overload.CharacterSheet;
import net.overload.inputOutput.file.LoadFromFile;
import net.overload.inputOutput.file.SaveToFile;
import net.overload.inputOutput.file.exceptions.LoadGameDataException;
import net.overload.inputOutput.file.exceptions.SaveGameDataException;

public class NewCharacter {
    public NewCharacter() {
        SaveToFile save = new SaveToFile();
        LoadFromFile load = new LoadFromFile();

        try{
            save.saveCharacterSheet(new CharacterSheet());
        } catch (final SaveGameDataException e){
            throw new RuntimeException(e);
        }

        try{
            load.loadCharacterSheet();
        } catch (final LoadGameDataException e) {
            throw new RuntimeException(e);
        }


    }
}
