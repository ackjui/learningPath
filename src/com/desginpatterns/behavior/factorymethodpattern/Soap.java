package com.desginpatterns.behavior.factorymethodpattern;

public class Soap implements Product{
    @Override
    public void displayProductName() {
        System.out.println("This is a Soap.");
    }
}
