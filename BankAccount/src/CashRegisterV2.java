import java.text.NumberFormat;

public class CashRegisterV2 {

	private double purchase;
	private double payment;
	private double discount;
	private double amountDiscounted;
	private double amountAfterDiscount;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	

	public CashRegisterV2()
	{
		purchase = 0;
		payment = 0;
	}

	public void recordPurchase(double amount) 
	{
		purchase = purchase + amount;

	}
	public void calcDiscount (final double THRESHOLD, final double DISCOUNT) {
		if(purchase >= THRESHOLD) {
			amountDiscounted = DISCOUNT * purchase;
			amountAfterDiscount = purchase - amountDiscounted;
			System.out.println("Your total purchases were " + formatter.format(purchase) + " and because you spent over " + formatter.format(THRESHOLD) + ", you are entitled to a " + (DISCOUNT * 100) + "% " + " discount of " + formatter.format(amountDiscounted) + " reducing your balance to " + formatter.format(amountAfterDiscount));
		}
	}

	public void receivePayment(double amountPaid)
	{
		payment = payment + amountPaid;
	}
	public double giveChange()
	{

		return (payment - amountAfterDiscount);

	}
	public void printChange() {
		System.out.print("Your change is: " + formatter.format((giveChange())));


	}




}