package categoriesofmethod;

public class Test {
	
	public int m1(int a, int b)
	{
		int i = a+b;
		
		return i;
		
	}
	
	public static int m2(int c, int d)
	{
		int e = c*d;
		
		return e;
	}
	
	public void compare(int u)
	{
		if(u>10)
		{
			System.out.println("u value is greater than 10");
		}
		else
		{
			System.out.println("u is not greater than 10");
		}
	}
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		int y = t.m1(4, 5);
		
		int z = m2(y, 5);
		
		t.compare(z);
		
		
		
		
		
	}

}
