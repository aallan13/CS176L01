import java.util.Random;

public class VenueTester {

	public static void main(String[] args) {

		Random generator = new Random(); 

		Venue prudentialCenter = new Venue(4, 5, 10);

		for(int i = 0; i < 100; i++) {
			int num1 = generator.nextInt(4);
			int num2 = generator.nextInt(5);
			int num3 = generator.nextInt(10);


			if(prudentialCenter.seatLookup(a, b, c) == true) {
				System.out.println("Section: " + num1 +", Row: "+ num2 +", Seat: "+ num3 + " is taken");
			}
			else {
				System.out.println("Section: " + num1 +", Row: "+ num2 +", Seat: "+ num3 + " is awarded");
			}


		}

		prudentialCenter.seatLookup(1, 2, 4);
	}





}
