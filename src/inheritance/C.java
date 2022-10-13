package inheritance;

public class C {
	
	private static C a = new C();
	
	
	
	private C()
	{
		
	}
	
	
	
	public static C getObject()
	{
		
		return a;
	}
	
	

}
