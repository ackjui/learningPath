package com.leetcode;

import java.util.*;

public class ImplementStrStr
{
    public static void main(String[] args)
    {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        boolean flag = false;
        int ans = -1;
        if (needle.equals(""))
        {
            return 0;
        }
        
        Stack<Character> hay = new Stack<>();
        
        for (int i = haystack.length()-1; i > 0; i--)
        {
            hay.push(haystack.charAt(i));
        }
        
        for (int j = 0; j < haystack.length(); j++)
        {
            
        }

        return 1;
    }
}