package arraydiscussion;

public class EnhancedForLoop {

	
	public static void main(String[] args) {
		
		
		String s [] = new String [5];
		
		s[0]= "abc";
		s[1]= "def";
		s[2]= "ghi";
		s[3]= "jkl";
		s[4]= "abc";
		
		
		for(String f:s)
		{
			System.out.println(f);
		}
		
		
		
	}
}
