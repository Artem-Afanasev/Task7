package com.example.task07;

public interface Subject {
    public void notifyAllObserver();
    public void attach(IObserver obs);
    public void detach(IObserver obs);
}
