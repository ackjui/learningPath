package com.designpattern.decoratorpattern.concretetopings;

import com.designpattern.decoratorpattern.Pizza;
import com.designpattern.decoratorpattern.ToppingsDecorator;

/**
 * Created by rorawat on 29/09/19.
 */
public class FreshTomatoTopping extends ToppingsDecorator
{
    // we need a reference to obj we are decorating
    Pizza pizza;

    public FreshTomatoTopping (Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato ";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }
}
