package encapsulation;

public class ATMMachine {
	
	
	
	
	public static void main(String[] args) {
		
		
		BankServer bs = new BankServer();
		
		bs.getBalance(1234);
		
		
		bs.setBalance(5000);
		
		bs.getBalance(1234);
	
		
		
		
		
	}

}
