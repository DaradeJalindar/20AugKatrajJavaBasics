package encapsulation;

public class BankServer {
	
private	double customer1 = 50000;



	public double getBalance(int pin)
	{
		double balance  =0;
		if(pin ==1234)
		{
			System.out.println("Your account balance is :"+customer1);
			
			balance = customer1;
		}
		else
		{
			balance =0;
			System.out.println("Please check the pin and try again");
		}
	return balance;
	}
	
	public void setBalance(int amount)
	{
		if(amount <=customer1)
		{
			customer1 = customer1 - amount;
			System.out.println("Please collect the cash");
		}
		else
		{
			System.out.println("Insufficient balance ");
		}
	}
	

}
