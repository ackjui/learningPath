package com.basicsofinputoutputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by A-8524 on 02-04-2019.
 */
public class PrimeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        findAllPrimeNumbers(Integer.parseInt(br.readLine()));
    }

    private static void findAllPrimeNumbers(int i) {
        for(int n = 2; n < i; n++)
        {
            boolean isPrime = true;
            for(int x = 2; x < n; x++)
            {
                if(n % x == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(n);
            }
        }
    }
}
