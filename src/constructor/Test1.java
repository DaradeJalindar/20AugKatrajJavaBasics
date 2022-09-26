package constructor;

	public class Test1 {
	
		
	//	syntax:
	//		
	//		accessmodifier classname()
	//		{
	//		actions
	//		}
		
		public  Test1()
		{
			System.out.println("zero argument constructor");
		}
		
		
		public Test1(int i)
		{
			System.out.println("one argument constructor");
		}
		
		public static void main(String[] args) {
			
			Test1 t1 = new Test1();
					
		}
	}
