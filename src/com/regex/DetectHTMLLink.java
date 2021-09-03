package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;

public class DetectHTMLLink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int numberOfLines = Integer.parseInt(sc.nextLine());
        String[] arr = new String[numberOfLines];
        
        for (int i = 0; i < numberOfLines; i++)
        {
            arr[i] = sc.nextLine();
        }
        
        for (int j = 0; j < numberOfLines; j++)
        {
            Pattern p = Pattern.compile("href=\"(.+?)\"(\\s.+)*>(.+)?</a>");

            Matcher m = p.matcher(arr[j]);

            while (m.find()) {
                out.println(m.group(1) + "," + (m.group(3) == null ? "" : m.group(3)));
            }
        }
    }
}
