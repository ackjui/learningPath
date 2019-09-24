package com.designpattern.stratergypattern;

public class Jin extends Fighter {
    public Jin(IJumpBehavior jumpBehavior, IRollBehavior rollBehavior) {
        super(jumpBehavior, rollBehavior);
    }

    @Override
    public void display() {
        System.out.println("Jin");
    }
}
