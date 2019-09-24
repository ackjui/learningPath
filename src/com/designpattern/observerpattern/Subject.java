package com.designpattern.observerpattern;

//Implemented by CricketData to communicate with observers
public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}
