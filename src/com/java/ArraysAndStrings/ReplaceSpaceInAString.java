import java.util.Scanner;

public class ReplaceSpaceInAString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(replaceSpace(str));
    }

    private static StringBuilder replaceSpace(String str)
    {
        StringBuilder strBuilder = new StringBuilder("");
        for(int i = 0; i < str.length(); i++)
        {
            if(' ' == str.charAt(i))
            {
                strBuilder.append("%20");
            }
            else
            {
               strBuilder.append(str.charAt(i)); 
            }
        }
        return strBuilder;
    }
}