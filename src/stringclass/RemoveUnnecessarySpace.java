package stringclass;

public class RemoveUnnecessarySpace {
	
	
	public static void main(String[] args) {
		
		String s = "      this is        a String     ";
		
		String s1 = s.trim();
		
		System.out.println(s1);//this is        a String
		
		String s2 = "";
		
		for(int i=0; i<s1.length(); i++ )
		{
			if((s1.charAt(i)==' ') && (s1.charAt(i+1)==' '))
			{
				continue;
			}
			else
			{
				s2 = s2+ s1.charAt(i);
			}
			
			
		}
		
		System.out.println(s2);
		
		
	}

}
