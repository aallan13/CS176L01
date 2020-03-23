import java.util.Scanner;

public class ComboLockTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int ticks = 0;
		int count = 0;

		ComboLock combo = new ComboLock(10,20,30);

		combo.rest();

		System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
		while (in.hasNextInt()) {
			ticks = in.nextInt();
			combo.turnRight(ticks);
			count++;

			if(ticks > 0 && ticks < 40 ) {
				System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
				ticks = in.nextInt();

				combo.turnLeft(ticks);

				count++;

				System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");

				ticks = in.nextInt();

				combo.turnRight(ticks);

				count++;

			}//if
			
			if(count == 3 ) {
				break;
			}//if
			
			else if(ticks < 0 || ticks > 40) {
				break;
			}//else if
				
		}//while
		if(combo.open()== true) {
			System.out.println("You opened the lock!");
		}//if
		else {
			System.out.println("You did not open the lock!");
		}//else



	}// main

}//class
