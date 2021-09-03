package com.desginpatterns.behavior.decoratorpattern;

public abstract class AddOnDecorator extends Beverage {
    
    abstract int cost();
    
    public void desc()
    {
        System.out.println("This is a decorator.");
    }
}
