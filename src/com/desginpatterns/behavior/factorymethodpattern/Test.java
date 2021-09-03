package com.desginpatterns.behavior.factorymethodpattern;

public class Test {
    public static void main(String[] args) {
        /*ProductFactory productFactory = new SoapFactory();
        Product myProduct = productFactory.createProduct();
        myProduct.displayProductName();*/
        
        
        //This approach is given in GFG
        ProductCreator productCreator = new ProductCreator();
        Product product = productCreator.createProduct("Shampoo");
        product.displayProductName();
    }
}
