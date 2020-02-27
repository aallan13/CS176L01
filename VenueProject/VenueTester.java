import java.util.Random;

public class VenueTester {

	public static void main(String[] args) {

		Random generator = new Random(); 

		Venue prudentialCenter = new Venue(4, 5, 10);

		for(int i = 0; i < 100; i++) {
			int a = generator.nextInt(4);
			int b = generator.nextInt(5);
			int c = generator.nextInt(10);


			if(prudentialCenter.seatLookup(a, b, c) == true) {
				System.out.println("Section: " + a +", Row: "+ b +", Seat: "+ c + " is taken");
			}
			else {
				System.out.println("Section: " + a +", Row: "+ b +", Seat: "+ c + " is awarded");
			}


		}

		prudentialCenter.seatLookup(1, 2, 4);
	}





}
