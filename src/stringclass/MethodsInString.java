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
		
		for(int i=0; i<charcount; i++)
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
		

		
		

		System.out.println("*************************************");		

		
		//	6. subString(int begin):
		
		String s14 = "Narmadapuram";
		
		String s15 = s14.substring(7);
		
		System.out.println(s15);//puram
		
		System.out.println("*************************************");
		
//		7. subString (int beginindex, int endindex)
		
		String s16= s14.substring(0, 7);
		
		System.out.println(s16);//Narmada
		
//		WAP to print the count of a character inside a string- philadelphia
		
		
		System.out.println("*************************************");		
			
			String s17 = "pahialadealphia";
			int count = 0;
			for(int i=0; i<s17.length(); i++ )
			{
				
			char s18 = s17.charAt(i);
			
			if(s18 == 'a')
			{
				count++;
			}
				
				
			}
			
			System.out.println(count);
			System.out.println("*************************************");			
//		9. toLowerCase()
			
			String s19 = "VELOCITy";
			
			String s20 = s19.toLowerCase();
			
			System.out.println(s20);//velocity
			System.out.println("*************************************");			
//		10. toUpperCase()
			
			String s21 = "VeloCiTy";
			
		String s22 = s21.toUpperCase();
			
		System.out.println(s22);//VELOCITY
		
		System.out.println("*************************************");		
		
//		11. replace(char oldchar, char newchar)

		String s23 = "abcdef";
		
		String s24 = s23.replace('b', 'd');
		
		System.out.println(s24);//adcdef
		
		System.out.println("*************************************");		
//		12. replace(String old, String new)
		
		
		String s25 = "Punecity";
		
		String s26 = s25.replace("city", "mahanagar");
		
		System.out.println(s26);//Punemahanagar
		System.out.println("*************************************");			
//	WAP to remove all the spaces from the String- This is string
		
//	13. trim()
		
		String s28 = "      this is        a String     ";
		
		String s29 = s28.trim();
		
		System.out.println(s29);//this is a String
		
//	WAP to remove the unnecessary spaces in between the string - "      this is        a String     "	
		System.out.println("*************************************");	
		
//	14. contains(String s)
		
		String s30 = "Vimannagar";
		
		boolean s31 = s30.contains("ngar");
		
		System.out.println(s31);//true

		System.out.println("*************************************");
		
//		15. startsWith(String s):
		
		String s32 = "Mumbai";
		
		boolean s33 = s32.startsWith("mu");
		
		System.out.println(s33);
		
		
		
	}
	
	

}
