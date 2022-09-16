package variable;

public class DefaultValues {
	
	
	static int i;
	
	static char c;
	
	String s;
	
	boolean b;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(i);
		
		System.out.println(c);
		
		DefaultValues dv = new DefaultValues();
		
		System.out.println(dv.s);
		
		System.out.println(dv.b);
		
	}

}
