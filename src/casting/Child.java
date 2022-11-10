package casting;

public class Child extends Parent {
	
	
	public Child()
	{
		System.out.println("zero arg child cons");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		Parent pp = (Parent)c;// Up casting
				
		Child ccc= (Child)pp; // Down casting--> This is valid as we are first doing the upcasting and then downcasting
		
		
		
		
		
		Parent p = new Parent();
		
		Child c1 = (Child)p;//--> Downcasting--> This downcasting is not valid as child reference variable cannot hold the parent object
		
		
		
		
	
		
		
		
		
	}

}
