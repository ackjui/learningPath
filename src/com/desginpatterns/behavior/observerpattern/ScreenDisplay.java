package com.desginpatterns.behavior.observerpattern;

import static java.lang.System.out;

public class ScreenDisplay implements IObserver, IDisplay{
    
    private final WeatherStation weatherStation;
    private int temperature;

    public ScreenDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        out.println("SrceenDisplay Temperature is : " + temperature);
    }
    
    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        display();
    }
}
