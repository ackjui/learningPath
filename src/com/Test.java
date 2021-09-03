package com;

public class Test {

    public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 6};

            int sum = 0;
            int tempSum = 0;

            for (int i = 1; i <= 6; i++)
            {
                sum+=i;
            }

            for (int i = 0; i < arr.length; i++)
            {
                tempSum = tempSum + arr[i];
            }

            System.out.println(sum-tempSum);
        
        }
}