package exceptionhandling;

public class TryFinally {
	
	public static void main(String[] args) {
		try
		{
			String s1 = null;
			
			String s2 = "abc";
			
			boolean s3 = s1.equals(s2);
				
		}
				
		finally
		{
			System.out.println("Finally is executing");
		}
		
		
		System.out.println("After finally");
		
	
		
	}

}
