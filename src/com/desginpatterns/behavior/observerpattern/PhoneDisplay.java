package com.desginpatterns.behavior.observerpattern;

import static java.lang.System.*;

public class PhoneDisplay implements IObserver, IDisplay {
    
    private final WeatherStation weatherStation;
    private int temperature;

    public PhoneDisplay(WeatherStation weatherStation)
    {
        this.weatherStation = weatherStation;
    }
    
    @Override
    public void display() {
        out.println("PhoneDisplay Temperature is : " + temperature);
    }

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        display();
    }
}
