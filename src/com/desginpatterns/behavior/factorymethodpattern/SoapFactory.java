package com.desginpatterns.behavior.factorymethodpattern;

public class SoapFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new Soap();
    }
}
