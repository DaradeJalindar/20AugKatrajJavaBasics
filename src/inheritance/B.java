package inheritance;

public class B extends A{
	
	int t = 50;
	
	
	public void m1()
	{
		int t = 80;
		
		System.out.println(t);
		
		System.out.println(this.t);
		
		System.out.println(super.t);
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m1();
		
	}
	
	
//	WAP to print the prime numbers between 1 to 100
	
	

}
