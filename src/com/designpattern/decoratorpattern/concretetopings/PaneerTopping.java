package com.designpattern.decoratorpattern.concretetopings;

import com.designpattern.decoratorpattern.Pizza;
import com.designpattern.decoratorpattern.ToppingsDecorator;

/**
 * Created by rorawat on 29/09/19.
 */
public class PaneerTopping extends ToppingsDecorator
{
    // we need a reference to obj we are decorating
    Pizza pizza;

    public PaneerTopping(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer ";
    }

    @Override
    public int getCost() {
        return 70 + pizza.getCost();
    }
}
