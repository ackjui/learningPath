import java.util.HashMap;
import java.util.Map;

public class PermAndPalin
{
    public static void main(String[] args)
    {
        System.out.println(isPermOfPalinMethodOne("TITIIP"));
        System.out.println(isPermOfPalinMethodTwo("TITIIP"));
    }

    private static boolean isPermOfPalinMethodOne(String str)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int oddCount = 0;

        for(char c : str.toCharArray())
        {
            String st = Character.toString(c);
            int i = 1;
            if(map.get(st) == null)
            {
                map.put(st, i);
            }
            else
            {
                map.put(st, map.get(st)+1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if((entry.getValue())%2 == 0)
            {
                continue;
            }
            else
            {
                oddCount++;
            }
        }
        return (oddCount==0 || oddCount==1) ? true : false; 
    }

    static boolean isPermOfPalinMethodTwo(String str)
    {
        boolean foundOdd = false;
        int[] table = getTable(str);

        for (int a : table)
        {
            if(a % 2 == 1)
            {
                if (foundOdd)
                {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    static int[] getTable(String str)
    {
        int[] table = new int[(Character.getNumericValue('z') - Character.getNumericValue('a')) + 1];
        for(char a : str.toCharArray())
        {
            if (getCharMap(a) != -1)
            {
                table[getCharMap(a)]++;
            }
        }
        return table;
    }

    static int getCharMap(Character val)
    {
        int a = 'a';
        int z = 'z';

        if(val >= a && val <= z)
        {
            return val - a;
        }
        return -1;
    }
}