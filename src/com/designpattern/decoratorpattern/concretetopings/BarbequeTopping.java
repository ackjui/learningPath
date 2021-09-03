package com.designpattern.decoratorpattern.concretetopings;

import com.designpattern.decoratorpattern.Pizza;
import com.designpattern.decoratorpattern.ToppingsDecorator;

/**
 * Created by rorawat on 29/09/19.
 */
public class BarbequeTopping extends ToppingsDecorator
{
    // we need a reference to obj we are decorating
    Pizza pizza;

    public BarbequeTopping(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque ";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 90; 
    }
}
