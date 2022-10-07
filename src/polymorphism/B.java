package polymorphism;

public class B extends A {
	
	
	public void m1()
	{
		System.out.println("m1 method from B Class");
	}
	
	
	public int m2(int i)
	{
		System.out.println("m2 method from B class int argument");
		return 10;
	}
	
	
	public static void m3()
	{
		System.out.println("non static method m3 from B class");
	}
	
	public void m4(String s)
	{
		System.out.println("m4 method of String argument from B class");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m1();// B class m1 method will get execute
		b.m4();// A class m4 method method
		
		A a = new A();
		
		a.m1();// A class m1 method will get execute
		
		a.m4();// A class m4 method
		
		a.m2(0);// A class m2 method will  get execute
		
		
		A a1 = new B();
		
		a1.m2(5);
		
		a1.m1();// B class m1 method
		
		a.m1();// A class m1 method
		
		a.m2(50);  // A class m2 method will execute
		
		a1.m2(80); // B class m2 method
		
		a1.m4();  // A class m4 method
		
		
		
		
		
		
		
	}


}
