package com.arrays;

class Test {

    public static void main(String[] args){
        A objA = new B();
        B objB = new B();
        objA.test1(); // test 1 of B
        objA.testA(); // test A of A
        //objA.testB(); // test B of B

        objB.test1(); // test 1 of B
        objB.testA(); // test A of A
        objB.testB(); // test B of B

    }
}
