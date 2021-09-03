package com.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        
        for (int i =0; i < testCase; i++)
        {
            int size = sc.nextInt();
            int[] arr = new int[size];
            List<Integer> eleList = new ArrayList<>();
            List<Integer> idxList = new ArrayList<>();
            
            for (int j = 0; j < size; j++)
            {
                arr[j] = sc.nextInt();
                
                if (!eleList.contains(arr[j]))
                {
                    eleList.add(arr[j]);
                    idxList.add((j+1));
                }
            }
            System.out.println(idxList.size());
            
            for (int x = 0; x < idxList.size(); x++)
            {
                System.out.print(idxList.get(x) + " ");
            }
        }
    }
}
