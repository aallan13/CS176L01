package edu.monmouth.cs176.s1160162.mp3;

import java.util.Scanner; 

public class MyClass2 {
	
	Scanner in = new Scanner(System.in);
	int[] arrayForUser;
	int arrayLen = 0;

	public MyClass2(int len) {
		arrayLen = len;
	}//constructor

	public void load() {
		int [] number = new int[arrayLen];
		System.out.print("Enter a number or type Q to quit: ");
		arrayLen = 0;
		for (int i = 0; i < number.length; i++) {
			if(in.hasNextInt()) {
				number[i] = in.nextInt();
				System.out.print("Enter a number or type Q to quit: ");
				arrayLen++;
			}//if
		}//for
		arrayForUser = new int[arrayLen];
		for (int i = 0; i < arrayLen; i++) {
			arrayForUser[i] = number[i];
		}//for
	}//load method

	public boolean search(int inNum) {
		boolean ifInNum = false;
		for (int i = 0; i < arrayLen; i++) {
			if (inNum == arrayForUser[i]) {
				ifInNum = true;
			}//if
		}//for
		return ifInNum;
	}// search method
	
	public int findMax() {
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < arrayLen; i++) {
			if (arrayForUser[i] > maxNum) {
				maxNum = arrayForUser[i];
			}//if
		}//for
		return maxNum;
	}// find the max method
	
	public int findMin() {
		int minNum = Integer.MAX_VALUE;
		for (int i = 0; i < arrayLen; i++) {
			if (arrayForUser[i] < minNum) {
				minNum = arrayForUser[i];
			}// if
		}// for
		return minNum;
	}// find the minimum method
	
	public int findMaxPos() {
		int max = Integer.MIN_VALUE;
		int maxPosition = 0;
		for (int i = 0; i < arrayLen; i++) {
			if (arrayForUser[i] > max) {
				max = arrayForUser[i];
				maxPosition = i;
			}// if 
		}// for
		return maxPosition;
	}// find max position method
	
	public int findMinPos() {
		int min = Integer.MAX_VALUE;
		int minPosition = 0;
		for (int i = 0; i < arrayLen; i++) {
			if (arrayForUser[i] > min) {
				min = arrayForUser[i];
				minPosition = i;
			}//if
		}// for
		return minPosition;
	}// find minimum position 

}// class
