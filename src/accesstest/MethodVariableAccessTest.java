package accesstest;

import accessmodifiers.Test;

public class MethodVariableAccessTest {
	
	
	
	public static void main(String[] args) {
		
//		Test.m3();//since m3 method is default hence we will not be able to access here(outside the package)
		
		Test t = new Test();
		
		t.m1();
		

	
		
		
		
	}

}
