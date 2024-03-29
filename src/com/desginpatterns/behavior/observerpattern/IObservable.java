package com.desginpatterns.behavior.observerpattern;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyObservers();
}
