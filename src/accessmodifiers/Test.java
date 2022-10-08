package accessmodifiers;

public class Test {
	
	
	public void m1()
	{
		System.out.println("public m1 method from Test class");
	}
	
	 void m2()
	{
		System.out.println("default non static method");
	}
	 
	 
	 static void m3()
		{
			System.out.println("default  static method");
		}
	
	 
	 private void m4()
	 {
		System.out.println("private m4 method from Test class"); 
	 }
	 
	 public static void main(String[] args) {
		
		 Test t = new Test();
		 
		 t.m4();
		 
	}
	 
	
	

}
