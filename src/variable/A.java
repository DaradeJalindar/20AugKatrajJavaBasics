package variable;

public class A {
	
	int i =50;
	int j = 60;
	
	static int k = 10;
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println(a1.i);//50
		System.out.println(a1.j);//60
		
		A a2 = new A();
		
		a2.i = 10;
		
		System.out.println(a2.i);//10
		
		A a3 = new A();
		
		System.out.println(a3.i);//50
		
		
		a1.j=90;
		
		
		System.out.println(a2.j);//60
		
		System.out.println(a1.j);//90
		
		System.out.println("value of k accessing directly is "+k);//10
		
		k=20;
		
		System.out.println("value of k by a1 object is " + a1.k);
		
		System.out.println("value of k by a2 object is " +a2.k);
		
		
		a3.k=100;
		
		System.out.println("value of k by a1 object is " +a1.k);
		
		System.out.println(k);//100
		
		
		
	}
	
	
	

}
