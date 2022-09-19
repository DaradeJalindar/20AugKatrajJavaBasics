package categoriesofmethod;

public class NoRetWithArg {
	
	public static void m1(int a)
	{
		int k= a+1;
		
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		m1(1);
		
		m1(50);
	}

}
