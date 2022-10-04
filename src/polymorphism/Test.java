package polymorphism;

public class Test extends Overloading {
	
	
	public void m1(double d)
	{
		System.out.println("method with double argument");
	}

	
	public static void main(String[] args) {
		Test t = new Test();
		
		t.m1();
		
		t.m1(52.23);
	}
}
