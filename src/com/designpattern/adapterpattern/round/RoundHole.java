package com.designpattern.adapterpattern.round;

public class RoundHole {
    
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public boolean fits(double radius)
    {
        return this.radius >= radius;
    }
}
