package com.algorithms.ibs;

public class Test {
    public static void main(String[] args) {
        int[] a = {3,2,1,0,4};
        int[] b = {2,4,2,2,1};
        System.out.println(a[(a=b)[2]]);
        System.out.println(a[a[2]]);
    }
}
