package operator;

public class BracketsOrder {
	
	public static void main(String[] args) {
		
		char a = '(';
		char b = ')';
		
		int c = a;
		
		int d = b;
		
		System.out.println("open bracket ASCII value is "+c);
		
		System.out.println("close bracket ASCII value is "+d);
		
		
		if(c<d)
		{
			System.out.println("correct order is ()");
		}
		
	}

}
