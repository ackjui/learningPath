package com.desginpatterns.behavior.factorymethodpattern;

public class ProductCreator {
    
    Product createProduct(String nameOfTheProduct)
    {
        if (nameOfTheProduct == null || "".equalsIgnoreCase(nameOfTheProduct))
        {
            return null;
        } else if (nameOfTheProduct.equalsIgnoreCase("Soap"))
        {
            return new Soap();
        } else if (nameOfTheProduct.equalsIgnoreCase("Shampoo"))
        {
            return new Shampoo();
        }
        
        return null;
    }
}
