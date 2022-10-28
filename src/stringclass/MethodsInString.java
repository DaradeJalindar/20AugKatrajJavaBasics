package stringclass;

public class MethodsInString {
	

	
	
	public static void main(String[] args) {
//	1. 	length()
		
		String s1 = "abcdef";
		
		int size = s1.length();
		
		System.out.println(size);//6
		
//		2. charAt(int index):
		
		String s2 = "velocity";
		
		char c = s2.charAt(2);
		
		System.out.println(c);
		
		
//		WAP to print all the characters of a string line by line- Velocity
		
		String s3 = "velocity";
		
		int charcount= s3.length();
		
		for(int i=0; i<charcount-1; i++)
		{
			char s4 = s3.charAt(i);
			
			System.out.println(s4);
		}
		
		
//		WAP to reverse a String - abcdef ----> fedcba
		
		String s5 = "abcdef";
		int s6 = s5.length()-1;
		for(int i=s6; i>=0; i-- )
		{
			char s7 = s5.charAt(i);
			
			System.out.print(s7);
		}
		
//	3. equals(String s): 
		System.out.println("*************************************");
		String s8 = "abc";
		
		String s9 = "abc";
		
		boolean issame = s8.equals(s9);
		
		System.out.println(issame);//true
		
		
		System.out.println("*************************************");
		
//		4. equalsIgnoreCase(String s)
		
		String s10 = "India";
		
		String s11 = "inDia";
		
		boolean iscontentsame = s10.equalsIgnoreCase(s11);
		
		System.out.println(iscontentsame);//true
		
		System.out.println("*************************************");		

		//	5. concat(String s): 
		
		String s12 = "Velocity";
		
		String s13 = s12.concat(" corporate");
		
		System.out.println(s13);//Velocity corporate
		
//		WAP to print the count of a character inside a string- philadelphia

		System.out.println("*************************************");		

		
		//	6. subString(int begin):
		
		String s14 = "Narmadapuram";
		
		String s15 = s14.substring(7);
		
		System.out.println(s15);//puram
		
		
//		7. subString (int beginindex, int endindex)
		
		String s16= s14.substring(0, 7);
		
		System.out.println(s16);//Narmada
		
		
		
		
		
		
		
	}

}
