package com.multithreading;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread by implementing Runnable");
        }
    }
}
