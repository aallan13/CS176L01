
public class BankAccountTester {

	public static void main(String[] args) 
	{
		BankAccount harrysChecking = new BankAccount(2500);
		BankAccount harrysSavings = new BankAccount(1000);
		System.out.println("Checking before transfer: " + harrysChecking.getBalance());
		System.out.println("Savings before transfer: " + harrysSavings.getBalance());
		
		//this transfer is done in two parts
		harrysChecking.withdraw(500);
		harrysSavings.deposit(500);
		System.out.println("Checking after transfer: " + harrysChecking.getBalance());
		System.out.println("Savings after transfer: " + harrysSavings.getBalance());

	}

}
