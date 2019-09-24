package com.designpattern.stratergypattern;

public class HighJump implements IJumpBehavior {
    @Override
    public void jump() {
        System.out.println("High Jump.");
    }
}
