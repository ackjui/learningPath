package com.desginpatterns.behavior.decoratorpattern;

public class MocaDecorator extends AddOnDecorator{
    
    private Beverage beverage;

    public MocaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    int cost() {
        return this.beverage.cost() + 4;
    }
}
