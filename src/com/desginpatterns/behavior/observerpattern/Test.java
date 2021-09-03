package com.desginpatterns.behavior.observerpattern;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();
        IObserver phoneDisplay = new PhoneDisplay(weatherStation);
        IObserver screenDisplay = new ScreenDisplay(weatherStation);
        
        weatherStation.add(phoneDisplay);
        weatherStation.add(screenDisplay);
        
        for (int i = 0; i < 10; i++)
        {
            Thread.sleep(1000);
            weatherStation.setTemperature(i);
            weatherStation.notifyObservers();
        }
    }
}
