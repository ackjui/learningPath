package com.arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;

        int[][] arr = new int[3][3];

        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 3; y++)
            {
                arr[x][y] = sc.nextInt();
            }
        }

        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 3; y++)
            {
                if((x+y)%2==0)
                {
                    odd = odd + arr[x][y];
                }else
                {
                    even = even + arr[x][y];
                }
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
