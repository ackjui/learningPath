package com.designpattern.adapterpattern;

import com.designpattern.adapterpattern.round.RoundPeg;
import com.designpattern.adapterpattern.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }
    
    public double getRadius()
    {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}
