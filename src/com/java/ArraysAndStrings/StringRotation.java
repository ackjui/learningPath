public class StringRotation
{
    public static void main(String[] args)
    {
        //System.out.println(isSubString("RO", "TO"));
        System.out.println(isRotation("ROHIT", "ITROH"));
    }

    static boolean isRotation(String s1, String s2)
    {
        if(s1.length() == s2.length() && s1.length() > 0)
        {
            String s1s1 = s1 + s1;
            if(isSubString(s1s1, s2))
            {
                return true;
            }
        }
        return false;
    }

    static boolean isSubString(String s1, String s2)
    {
        for(int i = 0; i <= s1.length() - s2.length(); i++)
        {
            int z = 0;
            for(int j = 0; j < s2.length(); j++)
            {
                if(s2.charAt(j) == s1.charAt(i+j))
                {
                    z++;
                    if(z == s2.length())
                    {
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
}