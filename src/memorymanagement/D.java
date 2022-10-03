package memorymanagement;

public class D extends E{
	
	public void m10()
	{
		a.m1();
		
		b.m6();
		
		c.m9();
		
	}
	
	public void m11()
	{
		a.m3();
		
		c.m9();
		
	}
	
	
	public static void main(String[] args) {
		D d = new D();
		
		d.m10();
		
		d.m11();
		
		
	}

}
