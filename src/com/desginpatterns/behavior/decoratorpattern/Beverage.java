package com.desginpatterns.behavior.decoratorpattern;

public abstract class Beverage {
    
    abstract int cost();

    void desc() {
        System.out.println("This is a Beverage.");
    }
}
