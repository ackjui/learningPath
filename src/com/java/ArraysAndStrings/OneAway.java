

public class OneAway
{

    public static void main(String[] args)
    {
        System.out.println(isOneAway("rohir", "rohit"));
    }

    static boolean isOneAway(String str1, String str2)
    {
        if(str1.length() == str2.length())
        {
            return oneEditReplace(str1, str2);
        }
        else if(str1.length() - str2.length() == 1)
        {
            return oneEditInsert(str1, str2);
        }
        else if(str1.length() - str2.length() == -1)
        {
            return oneEditInsert(str2, str1);
        }
        return false;
    }

    static boolean oneEditReplace(String str1, String str2)
    {
        boolean isOneDiff = false;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) != str2.charAt(i))
            {
                if(isOneDiff)
                {
                    return false;
                }
                isOneDiff = true;
            }
        }
        return true;
    }

    static boolean oneEditInsert(String s1, String s2)
    {
        int xIndex = 0;
        int yIndex = 0;

        while(xIndex < s1.length() && yIndex < s2.length())
        {
            if(s1.charAt(xIndex) != s2.charAt(yIndex))
            {
                if(xIndex != yIndex)
                {
                    return false;
                }
                yIndex++;
            }
            else
            {
                xIndex++;
                yIndex++;
            }
        }
        return true;
    }
}