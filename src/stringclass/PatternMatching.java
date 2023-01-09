package stringclass;

public class PatternMatching {
	
	
	
	public static void main(String[] args) {
		String s = "jfsadfhjdsfsadsdfhsdfsad";
		
		String pattern = "fsa";
		int count =0;
		
		String sarray[] = new String[s.length()-2];
		int end =3;
		
		for(int start =0; end<=s.length(); end++)
		{
		String substr = s.substring(start, end);
		
		
		sarray[start] = substr;
		
		start++;
				
		}
		
		for(int i=0; i<sarray.length; i++)
		{
			if(sarray[i].equals(pattern))
			{
				count++;
			}
		}
		
		System.out.println("Pattern is available inside the string for "+count+" times");
		
	}

}
