package com.desginpatterns.behavior.decoratorpattern;

import static java.lang.System.out;

public class Test {
    
    public static void main(String[] args) {
        Beverage beverage = new MocaDecorator(new CaramelDecorator(new Coffee()));
        out.println(beverage.cost());
    }
}
