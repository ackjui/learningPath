package com.designpattern.decoratorpattern.concretepizza;

import com.designpattern.decoratorpattern.Pizza;

/**
 * Created by rorawat on 29/09/19.
 *
 * Concrete Pizza class
 */
public class MargheritaPizza extends Pizza {

    public MargheritaPizza()
    {
        description = "MargheritaPizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
