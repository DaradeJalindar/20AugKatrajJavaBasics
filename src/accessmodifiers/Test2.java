package accessmodifiers;

public class Test2 {
	
	public static void main(String[] args) {
		Test t = new Test();
		
		Test3 t3 = new Test3();
		
		
		t.m1();
		
		t.m2();
		
		Test.m3();
		
//		t.m4();// Since m4 method is private hence we will be able to accces it inside only with in the class
		
		
		A a = new A();
		
		a.m1();
		
		System.out.println(t.s);
		
		
		
		
		
	}

}
