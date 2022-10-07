package polymorphism;

public class Child extends Parent {
	
	public void marry()
	{
		System.out.println("Marry method from Child class");
	}
	
	public void bike()
	{
		System.out.println("Bike method from Child class");
	}
	
	public static void main(String[] args) {
		
		
		Child c = new Child();
		
		c.marry();
		
		c.home();
		
		c.furniture();
		
	}
}
