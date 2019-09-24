package com.designpattern.stratergypattern;

public class JointRoll implements IRollBehavior {
    @Override
    public void roll() {
        System.out.println("Joint Roll.");
    }
}
