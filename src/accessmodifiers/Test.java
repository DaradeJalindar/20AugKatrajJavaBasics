package accessmodifiers;

public class Test {
	
	public int i = 20;
	
	String s = "abc";
	
	private char c = '9';
	
	public void m1()
	{
		System.out.println("public m1 method from Test class");
	}
	
	 void m2()
	{
		System.out.println("default non static method");
	}
	 
	 
	 static void m3()
		{
			System.out.println("default  static method");
		}
	
	 
	 private void m4()
	 {
		System.out.println("private m4 method from Test class"); 
	 }
	 
	 public static void main(String[] args) {
		
		 Test t = new Test();
		 
		 t.m4();
		 
		 
		 
		 
		 char c  = 'a';
		 char cc = 'A';
		 
		 int i = c;
		 
		 System.out.println(i);
		 
		 System.out.println(t.c);
		 
		 
		 int g = cc;
		 
		 System.out.println(g);
		 
		 
//		 WAP to check the arrival of correct order of brackets:
//		 '('  and ')'
		 
		 A.m2();
		 
	
		 
	}
	 
	
	

}
