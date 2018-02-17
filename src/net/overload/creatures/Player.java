package net.overload.creatures;

import net.overload.inputOutput.TextInput;
import net.overload.inputOutput.TextOutput;

import static net.overload.commons.boxBottomBorder;
import static net.overload.commons.boxTopBorder;

public class Player extends Creature {
    private TextInput input = new TextInput();
    private TextOutput output = new TextOutput();

    public void createNewPlayer() {
        setCreatureType(CreatureType.HUMAN);
        setGender(Gender.OTHER);

        output.displayTextOutputInline("Enter your first name: ");
        setFirstName(input.fetchInput());

        output.displayTextOutputInline("Enter your last name: ");
        setLastName(input.fetchInput());

        output.displayTextOutputInline("Enter your age: ");
        setAge(input.fetchNumberInput());

        showPlayerDetails();

        output.displayTextOutput("Is this right?");
        output.displayTextOutput("y/n?");

        if (!input.confirm()) {
            createNewPlayer();
        }
    }

    public void showPlayerDetails() {
        output.displayTextOutput(boxTopBorder());
        output.displayTextOutputInnerBox("Name: " + getFirstName() + " " + getLastName());
        output.displayTextOutputInnerBox("Age: " + getAge());
        output.displayTextOutputInnerBox("Gender: " + getGender().toString().toLowerCase());
        output.displayTextOutputInnerBox("Race: " + getCreatureType().toString().toLowerCase());
        output.displayTextOutput(boxBottomBorder());
    }

}
