package com.desginpatterns.behavior.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
    
    private final List<IObserver> observerList = new ArrayList<>(); 
    private int temperature;
    
    @Override
    public void add(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(IObserver::update);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
