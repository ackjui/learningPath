package com.designpattern.decoratorpattern.concretepizza;

import com.designpattern.decoratorpattern.Pizza;

/**
 * Created by rorawat on 29/09/19.
 *
 * Concrete Pizza class
 */
public class PeppyPaneerPizza extends Pizza {

    public PeppyPaneerPizza()
    {
        description = "PeppyPaneerPizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
