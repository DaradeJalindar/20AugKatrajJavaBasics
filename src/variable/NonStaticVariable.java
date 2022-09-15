package variable;

public class NonStaticVariable {
//	Syntax ---> data_type variablename= value
	
	char c = 'a';
	
	int a = 50;
	
	String s = "Daniel";
	
	
	public static void main(String[] args) {
		
		NonStaticVariable nsv = new NonStaticVariable();
		
		System.out.println(nsv.c);//a
		
		nsv.m2();//Daniel
		
		m1();//50
		
		}
	
	public static void m1()
	{
		NonStaticVariable obj = new NonStaticVariable();
		
		System.out.println(obj.a);//50
	}
	
	
	public void m2()
	{
		System.out.println(s);//Daniel
		
	}
	

}
