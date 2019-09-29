package com.designpattern.decoratorpattern.concretepizza;

import com.designpattern.decoratorpattern.Pizza;

/**
 * Created by rorawat on 29/09/19.
 *
 * Concrete Pizza class
 */
public class FarmHousePizza extends Pizza {

    public FarmHousePizza()
    {
        description = "FarmHousePizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
