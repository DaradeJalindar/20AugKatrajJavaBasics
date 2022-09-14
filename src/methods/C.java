package methods;

public class C {
	
	
	public void methodOne()
	{
		System.out.println("method one is executing");
	}
	
	public  void m3()
	{	
		methodOne();// calling of non static method from same class.
		A a = new A();
		a.m1();// calling of non static method from another class.
		System.out.println("M3 method is executing");
	}
	
	public static void methodTwo()
	{
		System.out.println("Static method is executing");
		C c = new C();
		c.methodOne();
	}

	
	public static void main(String[] args) {
		methodTwo();
		
		C c = new C();
		
		c.m3();
		
	}
}
