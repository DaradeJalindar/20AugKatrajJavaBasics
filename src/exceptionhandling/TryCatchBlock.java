package exceptionhandling;

public class TryCatchBlock {
	
	
	public static void main(String[] args) {
		
		int i = 10;
		
		int j = 0;
		int k =0;
		
		try
		{
		
		 k= i/j;
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(" Catch block is executing");
			k = 2;
		}
		
		System.out.println(k);
		
		System.out.println("Last line of code");
		
	}

}
