package categoriesofmethod;

public class NoRetWithArg {
	
	public static void m1(int a)
	{
		int k= a+1;
		
		System.out.println(k);
	}
	
	public static void addition(int a , int b)
	{
		int c= a+b;
		
		System.out.println("the sum of "+a+ " and "+b+" is "+c);
	}
	
	
	public static void substraction(int a , int b)
	{
		int c= a-b;
		
		System.out.println("Difference between "+a+ " and "+b+" is "+c);
	}
	
	public  void multiplication(int a , int b)
	{
		int c= a*b;
		
		System.out.println("multiplication of "+a+ " and "+b+" is "+c);
	}
	
	public static void main(String[] args) {
		m1(1);
		
		m1(50);
		
		substraction(80, 20);
		
		addition(2, 3);
		
		substraction(1, 1);
		
		NoRetWithArg nrwa = new NoRetWithArg();
		
		nrwa.multiplication(2, 5);
	}

}
