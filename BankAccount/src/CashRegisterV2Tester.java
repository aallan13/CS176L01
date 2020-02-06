import java.util.Scanner;

public class CashRegisterV2Tester {

	public static void main(String[] args) {

		CashRegisterV2 reg = new CashRegisterV2();

		final double SENTINEL = -1;
		final double DISCOUNT = .10;
		final double THRESHOLD = 50;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a purchase amount or - 1 to stop: ");

		while(in.hasNextDouble()) {
			double purchaseCost = in.nextDouble();
			if(purchaseCost == SENTINEL) {
				break;
			}
			System.out.print("Enter a purchase amount or - 1 to stop: ");
			reg.recordPurchase(purchaseCost);

		}
		reg.calcDiscount(THRESHOLD, DISCOUNT);
		System.out.print("Enter a payment amount: ");
		double amountPaid = in.nextDouble();
		reg.receivePayment(amountPaid);
		reg.giveChange();
		reg.printChange();




	}


}
