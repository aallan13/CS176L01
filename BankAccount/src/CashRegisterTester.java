import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		
		 CashRegister pay = new CashRegister();
		 
		 final double Sentinel = -1;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a purchase amount or -1 to stop: ");
		 
		 while(in.hasNextDouble()) {
		 
			double purchaseCost = in.nextDouble();
			
			if(purchaseCost == Sentinel) {
				break;
			}
			
			System.out.println("Enter a purchase amount or -1 to stop: ");
		 
	        pay.recordPurchase(purchaseCost);
	       

	      
		 }
		 
		 System.out.println("Enter a payment amount: ");
		 double paymentAmount = in.nextDouble();
		 pay.receivePayment(paymentAmount);
		 pay.giveChange();
		 pay.printChange();
		
		
	}

}
