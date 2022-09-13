package methods;

public class A {
	
	
	
	public void m1()
	{
		System.out.println("m1 is running");
	}
	
	
	public static void m2()
	{
		System.out.println("m2 static method is executed ");
	}

	
	public static void main(String[] args) {
		
		m2();
		
		A.m2();
		
		A a  = new A();
		
		a.m1();
				
		NonStaticMethod nsm = new NonStaticMethod();
		
		nsm.loginToApplication();
		
		
		nsm.addition();
		
		
		
	
		
		
		
		
		
		
		
	}
}
