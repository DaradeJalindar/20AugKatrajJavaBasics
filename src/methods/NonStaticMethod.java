package methods;

public class NonStaticMethod {
	
//	syntax:
//	access_modifier void name_of_method()
//	{
//		actions to be executed
//	}
	
	public void addition()
	{
		int a = 10;
		int b= 20;
		int c = a+b;
		
		System.out.println(c);
	}
	
	
	public void loginToApplication()
	{
		System.out.println("Login to application method");
	}
	
	
	public static void main(String[] args) {
		
//		object creation syntax: 
	
//			classname variablename = new classname();
		
		NonStaticMethod var = new NonStaticMethod();
		
		var.addition();
		
		var.loginToApplication();
		
		
		
	}
	
	
	
	
	

}
