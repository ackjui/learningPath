package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class MinimumAdditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++)
        {
            int size = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            
            int[] arr = new int[size];
            
            for (int j = 0; j < size; j++)
            {
                arr[j] = Integer.parseInt(sc.next());
            }
            
            int sum = calculateSum(arr);
            System.out.println(1 + (sum/(k+1) - size));
            
        }
    }

    private static int calculateSum(int[] arr) {
        return (int)(Arrays.stream(arr).sum());
    }
}
