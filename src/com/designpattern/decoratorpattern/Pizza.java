package com.designpattern.decoratorpattern;

/**
 * Created by rorawat on 29/09/19.
 *
 * Abstract Pizza class (All classes extend from this)
 */
public abstract class Pizza
{
    //it is an abstract pizza
    public String description = "Unknown Pizza";

    public String getDescription()
    {
        return description;
    }

    public abstract int getCost();
}
