package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logo {
    
        public static void main(String args[] ) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.parseInt(br.readLine());

            for(int i = 0; i < testCases; i++)
            {
                int size = Integer.parseInt(br.readLine());
                String[] matrix = new String[size];

                for(int j = 0; j < size; j++)
                {
                    matrix[j] = br.readLine();
                }
                System.out.println(isSyemmetric(size, matrix));
            }
        }

        private static String isSyemmetric(int size, String[] matrix)
        {
            int n = size % 2 == 0 ? size / 2 : (size / 2) + 1;
            for (int x = 0; x < n; x++)
            {
                StringBuilder sb = new StringBuilder();
                sb.append(matrix[x]).reverse();
                if (!matrix[x].equalsIgnoreCase(sb.toString()) || !matrix[x].equalsIgnoreCase(matrix[size - 1 - x]))
                {
                    return "NO";
                }
            }
            return "YES";
        }
}
