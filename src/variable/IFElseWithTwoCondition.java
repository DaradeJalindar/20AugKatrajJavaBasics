package variable;

public class IFElseWithTwoCondition {
	
	
	public static void main(String[] args) {
		
		
		int a= 30;
		int b = 20;
		
		if(a>b)
		{
			if(b>5)
			{
				System.out.println("second is greater than 5");
			}
			else
			{
				System.out.println("second is not greater than 5");
			}
		}
		else
		{
			System.out.println("Else is executing");
		}
		
		
	}

}
