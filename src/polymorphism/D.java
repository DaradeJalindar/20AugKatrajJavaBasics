package polymorphism;

public class D extends C
{
	
	int i = 20;
	
	public static void m1()
	{
		System.out.println("static m1 method from D class");
	}
	
	
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m1();//D class m1 method
		
		System.out.println(d.i);//d class variable - 20
		
		
		C c = new C();
		c.m1();// C class m1 met
		
		System.out.println(c.i);// c class variable - 10
		
		
		C c1 = new D();
		
		c1.m1();//C class m1 method
		
		System.out.println(c1.i);// c class variable - 10
		
	}

}
