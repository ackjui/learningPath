package com.desginpatterns.behavior.decoratorpattern;

public class CaramelDecorator extends AddOnDecorator{
    
    private Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int cost() {
        return this.beverage.cost() + 2;
    }
}
