package inheritance;

public class ConsB extends ConsA {
	
	
	public ConsB(int i)
	{
		super(80);
		System.out.println("ConsB class constructor");
	}
	
	
	public static void main(String[] args) {
		ConsB cb = new ConsB(50);
		
		
	}
	
	
	

}
