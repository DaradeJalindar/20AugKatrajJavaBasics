package exceptionhandling;

public class ThrowKeyword {
	
	
	public static void main(String[] args)
	{
		
		int i = 20;
		
		int j = 50;
		
		
		if(i<j)
		{
			throw new NullPointerException("just wanted to throw the exception");
		}
		else
		{
			throw new ArithmeticException("throwing exception");
		}
		
		
	}

}
