package methods;

public class B {
	
	public static void m1()
	{
		System.out.println("static method m1 is running");
	}
	
	public static void m2()
	{
		m1();
		System.out.println("static method m2 is running");
	}
	
	public void m3()
	{
		System.out.println("m3 non static method");
		m2();
		
	}
	
	
	public static void main(String[] args) {
		
		m2();
		
		
		System.out.println("*******************************");
		
		B b = new B();
		
		b.m3();
		
		
	}
	

}
