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
	
	
	
		
		
		
	}

}
