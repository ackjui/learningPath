package com.desginpatterns.behavior.stratergydesignpattern;

import static java.lang.System.*;

public class TripleQuack implements IQuack{
    @Override
    public void quack() {
        out.println("Triple Quack.");
    }
}
