package com.arrays;

import java.util.Scanner;

public class Frequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int count = 0;
        int idx = 0;
        
        int[] newArr = new int[10000];
        
        for (int i = 0; i < size; i++)
        {
            newArr[Integer.parseInt(sc.next())]++;
        }
        
        for (int i = 0;i < 256; i++)
        {
            if (newArr[i] > count)
            {
                count = newArr[i];
                idx = i;
            }
        }
        
        System.out.println(idx);
        
    }
}
