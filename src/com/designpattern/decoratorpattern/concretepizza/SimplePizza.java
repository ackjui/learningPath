package com.designpattern.decoratorpattern.concretepizza;

import com.designpattern.decoratorpattern.Pizza;

/**
 * Created by rorawat on 29/09/19.
 *
 * Concrete Pizza class
 */
public class SimplePizza extends Pizza {

    public SimplePizza()
    {
        description = "SimplePizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
