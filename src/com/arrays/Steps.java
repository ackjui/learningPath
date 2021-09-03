package com.arrays;
import java.util.*;
import java.io.*;

public class Steps {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        String[] n = br.readLine().split(" ");

        int N = Integer.parseInt(n[0]);
        int numberOfQueries = Integer.parseInt(n[1]);

        String[] cities = br.readLine().split(" ");
        List<String> cityList = Arrays.asList(cities);

        int count = 0;

        for (int i = 0; i < numberOfQueries; i++)
        {
            String[] query = br.readLine().split(" ");

            int index_startingPoint = Integer.parseInt(query[0]);

            if(!cityList.contains(query[1]))
            {
                System.out.println(-1);
                continue;
            }

            if (cities[index_startingPoint].equals(query[1]))
            {
                System.out.println(0);
                continue;
            }

            for (int x = 0; x < cities.length; x++)
            {

                if(query[2].equals("L"))
                {
                    index_startingPoint = (index_startingPoint - 1 + N) % N;

                } else  if(query[2].equals("R"))
                {
                    index_startingPoint = (index_startingPoint + 1) % N;
                }
                ++count;
                if(cities[index_startingPoint].equals(query[1]))
                {
                    System.out.println(count);
                    count = 0;
                    break;
                }else {
                    continue;
                }
            }
        }
        wr.close();
        br.close();
    }
}
