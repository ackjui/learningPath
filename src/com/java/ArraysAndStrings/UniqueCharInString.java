public class UniqueCharInString {

	public static void main(String[] args){

		System.out.println(unique("Rohiit"));	

	}


	static boolean unique(String str){
	if(str.length()>128) return false;
	boolean[] chars = new boolean[128];
	for(int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if(chars[val]){
				return false;
			}
			
			chars[val] = true;

		}
return true;
	}
}
