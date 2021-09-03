package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;

public class UserName {

    public static void main(String[] args) {

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

           if (m.matches())
           {
               out.println("Valid");
           } else
           {
               out.println("Invalid");
           }
        }

        in.close();
    }
}