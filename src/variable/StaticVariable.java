package variable;

public class StaticVariable {

//	syntax ---> static data_type variable_name = value;
	static int a = 20;
	
	static boolean n = false;
	
	static String s = "John";
	
	
	
	public static void main(String[] args) {
		
		System.out.println(a);//20
		System.out.println(StaticVariable.a);//20
		
		System.out.println(n);//false
		
		m1();//John
		StaticVariable sv = new StaticVariable();
		
		sv.m2();
		
		
			
	}
	
	public static void m1()
	{
		System.out.println(s);
	}
	
	public void m2()
	{
		int d = a+5;
		System.out.println(d);//25
		System.out.println(n);//false
	}
	
	
}
