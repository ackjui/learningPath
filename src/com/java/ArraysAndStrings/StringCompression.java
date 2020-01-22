public class StringCompression
{
    public static void main(String[] args)
    {
        System.out.println(compressString("abbbsssBB"));
    }

    //time complexity is O(p + k^2)
    static String compressString(String str)
    {
        int count = 0;
        String comStr = "";
        for (int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) != str.charAt(i+1))
            {
                count++;
                comStr += (str.charAt(i)+ String.valueOf(count));
                count = 0;
            }
            else
            {
                count++;
            }

            if(i == str.length() - 2)
            {
              comStr += (str.charAt(i)+ String.valueOf(count+1));
            }

        }

        if(comStr.length() < str.length())
        {
            return comStr;
        }
    return str;
    }
}