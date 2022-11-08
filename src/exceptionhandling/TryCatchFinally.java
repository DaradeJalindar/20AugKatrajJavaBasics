package exceptionhandling;

public class TryCatchFinally {
	
	
	
	public static void main(String[] args) {
		
		try
		{
			String s1 = null;
			
			String s2 = "abc";
			
			boolean s3 = s1.equals(s2);
			
		}
		
		catch(ArithmeticException w)
		{
			System.out.println("Exception arrived");
			
		}
		
		finally
		{
			System.out.println("Finally is executing");
		}
		
	}
	
	

}
