package exceptionhandling;

public class TryWithMultipleCatch {
	
	
	
	public static void main(String[] args) {
		
		int a[] = {1, 2, 5, 4, 8};
		
		try {
		
		System.out.println(a[0]);
			
		System.out.println(a[9]);
		
		System.out.println("last line of try block");
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic catch block is executing ");
			
		String message = e.getMessage();
		
		System.out.println(message);
		
	
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index catch block is executing ");
			String message = e.getMessage();
			
			System.out.println(message);
		}
		
		System.out.println("End of the code normally");
		
		
		
	}

}
