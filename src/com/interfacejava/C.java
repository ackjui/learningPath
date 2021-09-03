package com.interfacejava;

public class C implements A, B{
    
    @Override
    public void sayHello() {
         B.super.sayHello();
         A.super.sayHello();
    }
}
