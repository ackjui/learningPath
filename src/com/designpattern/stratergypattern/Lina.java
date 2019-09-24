package com.designpattern.stratergypattern;

public class Lina extends Fighter {
    public Lina(IJumpBehavior jumpBehavior, IRollBehavior rollBehavior) {
        super(jumpBehavior, rollBehavior);
    }

    @Override
    public void display() {
        System.out.println("Lina");
    }
}
