package constructor;

public class Test2 {
	
	public Test2()
	{
		System.out.println("zero argument constructor");
	}
	
	public Test2(String s)
	{
		System.out.println("The value of String is :"+s);
		System.out.println("one argument constructor");
	}
	

	public Test2(String s, int i)
	{
		System.out.println("Two argument constructor");
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2("Velocity");// one argument constructor
		
		Test2 t1 = new Test2();// zero argument constructor
		
		Test2 t3 = new Test2("abc", 50);// two argument constructor
		
	}
	
	
	
}
