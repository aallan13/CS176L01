
public class CashRegister {
	

private double purchase;
private double payment;

public CashRegister() {
	purchase = 0;
	payment = 0;
}

public void recordPurchase(double amount) {
	purchase = purchase + amount;
}

}
