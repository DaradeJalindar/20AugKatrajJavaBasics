package stringclass;

public class ConceptOfString {
	
	public static void main(String[] args) {
		
		
		
		
		String s1 = new String("abc");
		
		
		
		System.out.println(s1);//abc
		
		String s2 = new String ("def");
		
		String s3 = "xyz";
		
		String s4 = new String("abc");
		
		String s5 = "def";
		
		String s6 = "def";
		
		String s7 = "abc";
		
//		To check the reference variable are pointing to the same object:
		
		boolean ispointingsame = s5==s6;
		
		System.out.println(ispointingsame);//true
		
		boolean ispointingsame2 = s1==s7;
		
		System.out.println(ispointingsame2);//false
		
		
		
//		To check the content of the object whether they are equal or not:
		
		boolean iscontentsame= s4.equals(s7);
		
		System.out.println(iscontentsame);//true
	}

}
