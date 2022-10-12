package polymorphism;

public class Overloading {
	
	
	public void m1(int i)
	{
		System.out.println("method with int argument");
	}
	
	public void m1(int u, char c)
	{
		System.out.println("method with int argument");
	}
	
	
	public void m1(char c, int u)
	{
		System.out.println("method with char and int argument");
	}

	
	
	
	public static void m1(String s)
	{
		System.out.println("String argument static method");
	}
	
	public final int m1()
	{
		System.out.println("method with return type");
		
		return 50;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Overloading ol = new Overloading();
		
		ol.m1(50);
		
		m1("Velocity");
		
	}

	
	
}
