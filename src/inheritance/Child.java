package inheritance;

public class Child extends Parent{
	
	static String s = "def";
	
	int i = 10;
	
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
		
		System.out.println(c.i);// i variable from child class - 10
		
		Parent p = new Parent();
		
		System.out.println(p.i);// i variable from parent class - 50
		
		System.out.println(Parent.s);//s variable from parent class- abc
		
		System.out.println(s);//s variable from child class-  def
		
		
		
	}

}
