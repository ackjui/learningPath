package com.designpattern.stratergypattern;

//Driver Class
public class StreetFighter {

    public static void main(String[] args) {

        //let us make some behaviors first
        IRollBehavior pandaRoll = new PandaRoll();
        IJumpBehavior longJump = new LongJump();
        IRollBehavior jointRoll = new JointRoll();

        //Make a fighter with desired behaviors
        Lina lina = new Lina(longJump, pandaRoll);
        lina.display();

        // Test behaviors
        lina.jump();
        lina.roll();
        lina.kick();

        // Change behavior dynamically (algorithms are
        // interchangeable)
        lina.setRollBehavior(jointRoll);
        lina.roll();
    }
}
