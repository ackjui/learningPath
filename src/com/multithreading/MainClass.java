package com.multithreading;

public class MainClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();

        MyThread2 t = new MyThread2();
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();

        System.out.println("Main Thread");
    }
}
