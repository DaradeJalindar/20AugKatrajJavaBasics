package exceptionhandling;

public class Test3 {
	
	Test2 t;
	
	public void m2()
	{
		t.m1();
	}
	
	
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		
		t3.m2();
		
		
		
	}

}
