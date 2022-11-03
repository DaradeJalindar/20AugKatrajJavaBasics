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
		
		String s36 = "This is string";
		
		String s37 = s36.replace(" ", "");
		
		System.out.println(s37);//Thisisstring
		System.out.println("*************************************");
		
		
		
		
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
		
		System.out.println("*************************************");
		
//		16. endsWith(String s):
		
		String s34 = "ghijkl";
		
		boolean s35 = s34.endsWith("kl");
		
		System.out.println(s35);//true
		
		System.out.println("*************************************");
		
		
//		17. split(String s):
		
		String s38 = "This is a String";
		
		
	String[] s39	= s38.split(" ");
	
	for(String s40:s39)
	{
		System.out.println(s40);
	}
	
	System.out.println("*************************************");
	
//	18. reverse()
	
	StringBuffer sb = new StringBuffer("Australia");
	
	sb.reverse();
	
	System.out.println(sb);//ailartsuA
	
	
	
	System.out.println("*************************************");
//	WAP to print every word of a String in reverse order - This is a String --> String a is This
	
	String s43 = "This is a String";
	
	String[] s45 = s43.split(" ");
	
	int s46 = s45.length;
	
	for(int i=(s46-1); i>=0; i--)
	{
		System.out.println(s45[i]);
	}
	
	
	System.out.println("*************************************");
	
//	19. replaceAll(String regex)
	
	String s41 = "Spring";
	
	String s42 = s41.replaceAll("[A-Z]", "a");
	
	System.out.println(s42);//apring
	
	System.out.println("*************************************");
	
	String s47 = "Denver";
	
	String s48 = s47.replaceAll("[^A-Z]", "!");
	
	System.out.println(s48);//D!!!!!
	
	String s49 = s41.replaceAll("[A-Ea-p]", "#");
	
	System.out.println(s49);//S#r###
	
	System.out.println("*************************************");
	
	String s50 = "Acc23en@t^ur#e";
	
	String s51 = s50.replaceAll("[^A-Za-z]", "");
	
	System.out.println(s51);//Accenture
	
	System.out.println("*************************************");
	
	String s52 = s50.replaceAll("[A-Za-z0-9]", "");
	
	System.out.println(s52);//@^#
	
	System.out.println("*************************************");
	//20. toCharArray():
	
	String s53 = "pennsylvania";
	
	char[] s54 = s53.toCharArray();
	
	for(char cc :s54)
	{
		System.out.println(cc);
	}
	
//	Conversion of NonPrimitive to Primitive data type
	
	String s55 = "40";
	
	int s56 = Integer.parseInt(s55);
	
	System.out.println(s56+2);//12
	
	String s57 = "false";
	
	boolean s58 = Boolean.parseBoolean(s57);//false
	
	System.out.println(s58);
	
	String s59 = "45.65";
	
	double s60 = Double.parseDouble(s59);
	
	System.out.println(s60);//45.65
	
	
//	Conversion of Primitive to NonPrimitive data type
	
	
	int s61 = 80;
	
	String s62 = String.valueOf(s61);

	System.out.println(s62+2);//802
	
	
	double s63 = 85.23;
	
	String s64 = String.valueOf(s63);
	
	System.out.println(s64);//85.23
	
	
	
	char s65 = 'c';
	
	String s66	= String.valueOf(s65);

	System.out.println(s66);//c
	
	System.out.println("*************************************");
	
	char s67 = 'a';
	
	boolean s68 = Character.isAlphabetic(s67);
	
	System.out.println(s68);// true
	
	
	char s69 = '9';
	
	boolean s70 = Character.isDigit(s69);
	
	System.out.println(s70);//true
	System.out.println("*************************************");
	
//	WAP to count the total number of numeric characters present in a String- "Gu35ya32n2a"
	
	String s71 = "Gu35ya32n2a";
	
	int countt =0;
	for(int i =0; i<s71.length(); i++)
	{
		char s72 = s71.charAt(i);
		
		if(Character.isDigit(s72))
		{
			countt++;
			
		}
	}
	
	System.out.println("Total numeric characters are: "+countt);
	
	System.out.println("*************************************");

	//	WAP to count the number of Capital letters in a String - "HelLo"
	
	
	String s73= "HelLO";
	
	int counttt = 0;
	for(int i =0; i<s73.length(); i++)
	{
		char s74 = s73.charAt(i);
		
		int value = s74;
		
		if(value>=65 && value<=90)
		{
			counttt++;
		}
		
	}
	
	System.out.println("Total number of capital letters are :"+counttt);
	
	
//	compareTo(String s)
	
	String s75 = "abc";		
	
	String s76 = "abcbbb";		
	
	
	int s77= s75.compareTo(s76);
	
	
	System.out.println(s77);
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	
	
	

}
