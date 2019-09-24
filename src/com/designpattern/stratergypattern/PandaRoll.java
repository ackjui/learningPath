package com.designpattern.stratergypattern;

public class PandaRoll implements  IRollBehavior {
    @Override
    public void roll() {
        System.out.println("Panda Roll.");
    }
}
