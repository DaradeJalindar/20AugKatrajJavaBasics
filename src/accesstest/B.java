package accesstest;

import accessmodifiers.A;

public class B extends A{
	
	public static void main(String[] args) {
		
		A a = new A();
		
//		a.m1();//since m1 method is protected we will not be able to access it through A's reference variable.
		
		
		B b = new B();
		
		b.m1();
		
		System.out.println(b.g);
		
		
		
	}

}
