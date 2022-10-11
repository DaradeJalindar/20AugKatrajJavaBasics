package polymorphism;

public class Parent {
	
	
	final int i = 81;
	
	public void home()
	{
		System.out.println("Home method from parent class");
	}
	
	public void car()
	{
		System.out.println("car method from parent class");
	}
	
	public void capital()
	{
		System.out.println(i);
		
	System.out.println("Capital method from parent class");
	}
	
	
	public static void furniture() {
		System.out.println("Static furniture method from parent class");
	}
	
	public final void marry()
	{
		System.out.println("Pre decided marry method from Parent class");
	}
	
}
