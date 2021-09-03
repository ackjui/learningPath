package com.arrays;

import java.util.Scanner;

import static java.lang.System.*;

public class Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++)
        {
            int lengthOfArray = sc.nextInt();

            int k = sc.nextInt();

            String number = sc.next();

            double mod = Double.parseDouble(number) % k;

            for (int j = 0; j < lengthOfArray; j++)
            {
                StringBuilder sb = new StringBuilder();
                for (int l = 0; l < lengthOfArray; l++)
                {
                    if (j!=l)
                    {
                        sb.append(number.charAt(l));
                    }
                }
                String newStr = String.valueOf(sb);

                if(!newStr.equalsIgnoreCase("") && Integer.parseInt(newStr) % k > mod)
                {
                    mod = Double.parseDouble(newStr) % k;
                }
            }
            out.println((int) mod);
        }
    }
}
