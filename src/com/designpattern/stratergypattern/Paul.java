package com.designpattern.stratergypattern;

public class Paul extends Fighter {
    public Paul(IJumpBehavior jumpBehavior, IRollBehavior rollBehavior) {
        super(jumpBehavior, rollBehavior);
    }

    @Override
    public void display() {
        System.out.println("Paul");
    }
}
