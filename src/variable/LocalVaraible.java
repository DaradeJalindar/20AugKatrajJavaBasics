package variable;

public class LocalVaraible {
	
	int j = 40;// instance or non static variable
	
	public static void main(String[] args) {
		
		int i = 50; // local variable
		
		System.out.println(i);
		
//		int h;
//		
//		System.out.println(h);
		
	}
	
	public static void m1()
	{
		LocalVaraible lv = new LocalVaraible();
		
		System.out.println(lv.j);
		
		String s = "abc";
		
		System.out.println(s);
		
		int i = 10;
		
		
	}
	
	
	
	

}
