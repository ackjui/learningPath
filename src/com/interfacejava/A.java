package com.interfacejava;

public interface A {
    
    default void sayHello()
    {
        System.out.println("Test A.");
    }
}
