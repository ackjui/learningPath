package com.desginpatterns.behavior.factorymethodpattern;

public class Shampoo implements Product{
    @Override
    public void displayProductName() {
        System.out.println("This is a Shampoo.");
    }
}
