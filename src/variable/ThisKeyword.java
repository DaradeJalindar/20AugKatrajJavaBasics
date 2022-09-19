package variable;

public class ThisKeyword {
	
	int a = 10;
	
	static String s = "abc";
	
	
	
	public void m1()
	{
		int a = 50;
		
		String s = "def";
		
		System.out.println(a);//50--> Local variable
		
		System.out.println(this.a);//10--> non static variable
		
		System.out.println(s);//def
		
		System.out.println(ThisKeyword.s);//abc
		
	}
	
	public static void m2()
	{
		int a =60;
		
		System.out.println(a);// 60
		
		ThisKeyword tk = new ThisKeyword();
		
		System.out.println(tk.a);
		
		
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword tk = new ThisKeyword();
		
		tk.m1();
		
		
	}

}
