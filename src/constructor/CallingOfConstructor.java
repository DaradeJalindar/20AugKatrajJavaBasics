package constructor;

public class CallingOfConstructor {
	
	
	public CallingOfConstructor()
	{	this("velocity");
		System.out.println("zero argument constructor");
		
	}
	
	public CallingOfConstructor(String s)
	{	
		System.out.println("The value of String is :"+s);
		System.out.println("one argument constructor");
	}
	

	public CallingOfConstructor(String s, int i)
	{
		System.out.println("Two argument constructor");
	}

}
