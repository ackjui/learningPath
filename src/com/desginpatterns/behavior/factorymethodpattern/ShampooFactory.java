package com.desginpatterns.behavior.factorymethodpattern;

public class ShampooFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Shampoo();
    }
}
