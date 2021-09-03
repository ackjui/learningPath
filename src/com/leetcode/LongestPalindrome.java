package com.leetcode;

public class LongestPalindrome{

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) 
    {
        int max = 0;
        String ans = "";
        
        for (int j = 0; j < s.length(); j++)
        {
            for (int k = j+1; k <= s.length(); k++)
            {
                String subStr = s.substring(j,k);
                int subStrLength = subStr.length();
                
                if (isPalindrome(subStr) && subStrLength > max)
                {
                     ans = subStr;
                     max = subStrLength;
                }
            }
        }
        
        return ans;
        
    }
    
    static boolean isPalindrome(String newStr)
    {
        boolean flag = true;
        int length = newStr.length();
        
        for (int i = 0; i < newStr.length()/2; i++)
        {
            if(newStr.charAt(i) != newStr.charAt(length-i-1))
            {
                flag = false;
            }
        }
        return flag;
    }
}