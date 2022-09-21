package categoriesofmethod;

public class WithRetNoArg {
	
	public static int m1()
	{
		int a = 5+6;
		
		System.out.println(a);
		
		return 4565;
		
	}
	
	public String rollNumGen()
	{
		int i = 1;
		String uid = "Eder"+i;
		
		return uid;
	}

	
	public static void main(String[] args) {
		
		int f = m1();
		
		System.out.println(f);
		
		WithRetNoArg wrna = new WithRetNoArg();
		
		String s = wrna.rollNumGen();
				
		System.out.println(s);
		
		String s1= s+"123";
		
		System.out.println(s1);
		
	}
}
