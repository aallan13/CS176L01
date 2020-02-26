package edu.monmouth.cs176.s1160162.mp3;

import java.util.Scanner; 

public class MyClass2 {

	Scanner in = new Scanner(System.in);
	int max = 0;
	int min = 0;
	int counter = 0;
	int input = 0;
	final int MAX_ARRAY_SIZE = 100;
	boolean done = false;
	int [] integersArray;

	public MyClass2() {
		integersArray = new int[MAX_ARRAY_SIZE];
		
	}// constructor
	
	// calls scanner and takes input
	public void load() {
		
		while(done == false) {
			System.out.println("Enter a number of integers or -1 to stop: ");
			input = in.nextInt();
			if (input == -1) {
				done = true;
				counter--;
			}//if
			else {
				integersArray[counter] = input;
				counter++;
			}//else
		}//while
		
	}// load method
	
	// returns true or false if integer is in array
	public boolean search(int inNum) {
		boolean isInArray = false;
		for (int i=0; i< counter; i++) {
			if (integersArray[i] == inNum)
				isInArray = true;
		}//for
		return isInArray;
	}//search method
	
	// method to find maximum value in array
	public int findMax() {
		for(int i=0; i<= counter; i++) {
			if(i==0) {
				max = integersArray[i];
				
			}//if
			else {
				if(integersArray[i] > max)
					max = integersArray[i];
			}//else
			
		}// for
		return max;
	}// findMax method
	
	// method to find minimum value in array
	public int findMin() {
		for(int i=0; i<=counter; i++) {
			if (i==0) {
				min = integersArray[i];
			}//if
			else {
				if(integersArray[i] < min) {
					min = integersArray[i];
				}//if
			}//else
		}//for
		return min;
		
	}// findMin Method
	
	// method to return index position of the largest number in array
	public int findMaxPos() {
		int max = Integer.MIN_VALUE;
		int maxPosition = 0;
		for(int i=0; i<integersArray.length; i++) {
			if(integersArray[i] > max) {
				max = integersArray[i];
				maxPosition = i;
			}//if
		}//for
		return maxPosition;
		
	}// findMaxPos
	
	// method to return the index position of the smallest number in array
	public int findMinPos() {
		int min = Integer.MAX_VALUE;
		int minPosition = 0;
		for(int i=0; i<integersArray.length; i++) {
			if(integersArray[i]> min) {
				min = integersArray[i];
				minPosition = i;
			}//if
		
		}// for
		return minPosition;
		
	}// findMinPos method

}// public class