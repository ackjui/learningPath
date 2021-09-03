package com.interfacejava;

public interface B 
{
    default void sayHello()
    {
        System.out.println("Test B.");
    }   
}
