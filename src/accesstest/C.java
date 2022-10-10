	package accesstest;
	
	public class C extends B
	{
		
		
		public static void main(String[] args) {
			C c = new C();
			
			c.m1();
			
			B b = new B();
			
	//		b.m1(); Here we will not be able to access m1 method because B is here a parent class of C class.
			
			
		}
		
		
		
	
	}
