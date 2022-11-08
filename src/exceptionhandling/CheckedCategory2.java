package exceptionhandling;

public class CheckedCategory2 {
	
	public static void main(String[] args) {
		
		System.out.println("First line");
		
		
		try {
			Thread.sleep(3000);
		} 
		
		catch (InterruptedException e) {
			
			System.out.println("Inside the catch block ");
		
		}
		
		System.out.println("Second line");
		
	}

}
