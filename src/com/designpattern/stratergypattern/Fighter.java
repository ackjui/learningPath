package com.designpattern.stratergypattern;

abstract class Fighter {
    IJumpBehavior jumpBehavior;
    IRollBehavior rollBehavior;

    public Fighter(IJumpBehavior jumpBehavior, IRollBehavior rollBehavior)
    {
        this.jumpBehavior = jumpBehavior;
        this.rollBehavior = rollBehavior;
    }

    public void punch()
    {
        System.out.println("Default Punch");
    }

    public void kick()
    {
        System.out.println("Default Kick");
    }

    //Delegate Jump to IJumpBehavior
    public void jump()
    {
        jumpBehavior.jump();
    }

    //Delegate Roll to IRollBehavior
    public void roll()
    {
        rollBehavior.roll();
    }

    public void setJumpBehavior(IJumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public void setRollBehavior(IRollBehavior rollBehavior) {
        this.rollBehavior = rollBehavior;
    }

    public abstract void display();
}
