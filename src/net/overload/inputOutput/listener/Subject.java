package net.overload.inputOutput.listener;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String enteredValue;

    public String getEnteredValue() {
        return enteredValue;
    }

    public void setEnteredValue(String enteredValue) {
        this.enteredValue = enteredValue;
        notifyAllObservers();
    }

    public void attach(final Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(o -> o.update());
    }
}
