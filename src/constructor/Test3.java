package constructor;

public class Test3 {
	
	
	public Test3()
	{
		this("Velocity");
		System.out.println("zero argument constructor");
	}


	public Test3(String s)
	{
		this(80, 56.65);
		System.out.println("one argument constructor");
	}
	

	public Test3(int i, double d)
	{
		System.out.println("two argument constructor");
	}
	
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
	}


}
