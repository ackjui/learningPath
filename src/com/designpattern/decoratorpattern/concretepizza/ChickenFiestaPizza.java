package com.designpattern.decoratorpattern.concretepizza;

import com.designpattern.decoratorpattern.Pizza;

/**
 * Created by rorawat on 29/09/19.
 *
 * Concrete Pizza class
 */
public class ChickenFiestaPizza extends Pizza {

    public ChickenFiestaPizza()
    {
        description = "ChickenFiestaPizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
