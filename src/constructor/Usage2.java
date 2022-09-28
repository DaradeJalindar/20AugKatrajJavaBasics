package constructor;

public class Usage2 {
	
	int i;
	String s;
	
	
	
	public Usage2(int i, String s)
	{
		this.i=i;
		this.s=s;
	}
	
	public static void main(String[] args) {
		Usage2 u2 = new Usage2(80, "abc");
			
		Usage2 u3 = new Usage2(100, "def");
		
		System.out.println(u2.i);
		
		System.out.println(u3.s);
	
		
		
		
	}
	
	

}
