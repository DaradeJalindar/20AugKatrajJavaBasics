package inheritance;

public class SingletonClasss {
	
	private static SingletonClasss a = new SingletonClasss();
	
	int i;
	
	private SingletonClasss()
	{
		
	}
	
	
	
	public static SingletonClasss getObject()
	{
		
		return a;
	}
	
	
	public void m1()
	{
		i=50;
		System.out.println(i);
		System.out.println("m1 method from singleton class");
	}
	
	public void m2()
	{
		i=30;
		System.out.println("m1 method from singleton class");
	}
	
	

}
