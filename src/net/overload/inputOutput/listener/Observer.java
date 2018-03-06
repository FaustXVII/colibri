package net.overload.inputOutput.listener;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
