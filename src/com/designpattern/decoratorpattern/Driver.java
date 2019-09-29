package com.designpattern.decoratorpattern;

import com.designpattern.decoratorpattern.concretepizza.FarmHousePizza;
import com.designpattern.decoratorpattern.concretepizza.MargheritaPizza;
import com.designpattern.decoratorpattern.concretetopings.FreshTomatoTopping;
import com.designpattern.decoratorpattern.concretetopings.PaneerTopping;

/**
 * Created by rorawat on 29/09/19.
 *
 * // Driver class and method
 */
public class Driver {
    //create a new marghrita pizza
    public static void main(String[] args) {
        Pizza mergherita = new MargheritaPizza();
        System.out.println(mergherita.getDescription() + " Cost: " + mergherita.getCost());

        //Create a new farmhouse pizza
        Pizza farmhousePizza = new FarmHousePizza();

        //decorate it with fresh tomato topping
        farmhousePizza = new FreshTomatoTopping(farmhousePizza);

        //decorate it with paneer topping
        farmhousePizza = new PaneerTopping(farmhousePizza);

        System.out.println(farmhousePizza.getDescription() + " Cost:  " + farmhousePizza.getCost());
    }

}
