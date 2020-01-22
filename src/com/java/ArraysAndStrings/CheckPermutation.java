public class CheckPermutation{

	public static void main(String[] args)
	{
		System.out.println(checkPermMethodOne("ormit", "rohit"));
		System.out.println(checkPermMethodOne("orhmt", "rohit"));
	}


	
	static boolean checkPermMethodOne(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		java.util.Arrays.sort(char1);
		java.util.Arrays.sort(char2);
		return (new String(char1)).equals(new String(char2));	
	}

	static boolean checkPermMethodTwo(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}

		int[] intArray = new int[128];
		char[] charArrOne = str1.toCharArray();
		for (char a : charArrOne)
		{
			intArray[a]++;
		}

		char[] charArrTwo = str2.toCharArray();
		for (char b : charArrTwo)
		{
			intArray[b]--;
			if(intArray[b] < 0)
			{
				return false;
			}
		}
		return true;
	}
}
