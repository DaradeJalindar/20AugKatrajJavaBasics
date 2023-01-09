package stringclass;

public class AddNumberIndividually {
	
	public static void main(String[] args) {
		
		String s = "hj4234hkjhkj3k432";
		
		String numeric = "";
		
		int sum =0;
		for(int i=0; i<s.length(); i++)
		{
			char charvalue = s.charAt(i);
			
			if(Character.isDigit(charvalue))
			{
				numeric = numeric + charvalue; 
				
				int value = Integer.parseInt(numeric);
				
				sum = value + sum;
				
				numeric = "";
			}
		}
		
		System.out.println(sum);
		
		
	}

}
