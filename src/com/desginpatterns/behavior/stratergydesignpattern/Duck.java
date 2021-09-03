package com.desginpatterns.behavior.stratergydesignpattern;

public class Duck {
    IFly fb;
    IQuack qb;
    IDisplay db;
    
    Duck (IFly fly, IQuack quack, IDisplay display)
    {
        this.fb = fly;
        this.qb = quack;
        this.db = display;
    }
    
    public void fly(){
        fb.fly();
    }
    
    public void display()
    {
        db.display();
    }
    
    public void quack()
    {
        qb.quack();
    }
}
