package inheritance;

public class Child extends Parent{
	
	public void bike()
	{
		System.out.println("Bike method from Child class");
	}
	
	public static void money() {
		System.out.println("money from child class");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.home();// method from parent class
		
		c.capital();// method from parent class
		
		c.car();// method from parent class
		
		c.bike();// method from child class
		
		furniture();// method from parent class
		
		farm();// method from grandparent class
		
		money();
	}

}
