package com.desginpatterns.behavior.stratergydesignpattern;

public class Test {
    public static void main(String[] args) {
        Duck mountainDuck = new Duck(new FlyHigh(), new DoubleQuack(), new BarDisplay());
        mountainDuck.quack();
        mountainDuck.display();
        mountainDuck.fly();
    }
}
