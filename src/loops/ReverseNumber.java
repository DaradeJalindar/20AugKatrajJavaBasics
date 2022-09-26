package loops;

public class ReverseNumber {
	
	public static void reverseNumber(int number)
	{
		int reverse = 0;
		
		while(number!=0)
		{
		int remainder = number %10;
		
		reverse = reverse*10 +remainder;
		
		number = number /10;
		}
		
		System.out.println(reverse);
	}
	
	
public static void main(String[] args) {
		int originalnumber = 12121;
		int number = 12121;
		
		int reverse = 0;
		
		while(number!=0)
		{
		int remainder = number %10;
		
		reverse = reverse*10 +remainder;
		
		number = number /10;
		}
		
		System.out.println(reverse);
		
		if(originalnumber == reverse)
		{
			System.out.println(reverse+ " is a palindrome number");
		}
		else
		{
			System.out.println(reverse+ " is not a palindrome number");
		}
		
		
		
		
	}

}
