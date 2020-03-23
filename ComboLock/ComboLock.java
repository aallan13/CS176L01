import java.util.Scanner;

public class ComboLock {
	
	boolean openLock = false;
	int correctNum1 = 0;
	int correctNum2 = 0;
	int correctNum3 = 0;
	int count=0;
	
	int currentNum = 0;
	
	boolean num1Correct = false;
	boolean num2Correct = false;
	boolean num3Correct = false;
	
	//constructor
	public ComboLock(int secret1, int secret2, int secret3) {
		correctNum1 = secret1;
		correctNum2 = secret2;
		correctNum3 = secret3;
		
	}// combolock constructor
	
	public void rest() {
		num1Correct = false;
		num2Correct = false;
		num3Correct = false;
		openLock = false;
		int currentNum = 0;

	}// reset method
	
	//
	public void turnLeft(int ticks) {
		count +=1;
		// checks if the second number is right and turns the lock
		currentNum = ((currentNum + ticks) + 40) % 40;
		System.out.println("The current number is: " + currentNum);
		if(count == 2 && currentNum == correctNum2 ) {
			num2Correct = true;
			
		}//if
	}//turnLeft method
	
	public void turnRight(int ticks) {
		// checks if the first number is right and turns the lock

		count +=1;
		currentNum = ((currentNum - ticks) + 40) % 40;
		System.out.println("The current number is: " + currentNum);
		if(count == 1 && currentNum == correctNum1) {
			num1Correct = true;
		}//if
		if(count == 3 && currentNum == correctNum3) {
			num3Correct = true;
		}//if

	}// turnRight method
	public boolean open() {
		
		if(num1Correct == true && num2Correct == true && num3Correct == true) {
			openLock = true;
		}//if
		else {
			openLock = false;
		}//else
		return openLock;
	}// open method

	
	

}//class
