package operator;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
//		AND operator '&&'
		
		int a = 10;
		int b = 20;
		
	boolean c	= a<b && b>20;
	
	System.out.println(c);//false
	
	
//	OR operator '||'
	
	boolean d =  a<b || b>20;
	
	System.out.println(d);//true
	
	
//	NOT operator '!'
	
	
	boolean e = !(a==b);
	
	System.out.println(e);//true
	
	
	
	int f = 10;
	
	int g = 10;
	int h = 1;
	int i = 10;
		
	
	if((f==g) && (h==i)&&(f==h))
	{
		System.out.println("all sides are equal");
	}
	else
	{
		System.out.println("all sides are not equal");
	}
		
		
	}

}
