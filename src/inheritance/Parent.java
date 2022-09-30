package inheritance;

public class Parent extends GrandParent  {
	int i = 50;
	
	static String s = "abc";
	
	public void home()
	{
		System.out.println("Home method from parent class");
	}
	
	public void car()
	{
		System.out.println("car method from parent class");
	}
	
	public void capital()
	{
		System.out.println("Capital method from parent class");
	}
	
	
	public static void furniture() {
		System.out.println("Static furniture method from parent class");
	}
	
	
	
}
