
package edu.monmouth.cs176.s1160162.mp3;

import java.util.Scanner;

public class MyClass {
	
	// initialize scanner
	Scanner in = new Scanner(System.in);
	
	String [] arrayString;
	String input;
	String max = "";
	String min = "";
	final int MAX_ARRAY = 100;
	boolean stop = false;
	int counter = 0;
	
	
	//constructor 
	
	public MyClass() {
		
		arrayString = new String[MAX_ARRAY];
		
	}// MyClass constructor
	
	// load method for input from user
	
	public void load() {
		
		while(stop == false) {
			System.out.println("Enter a number of strings in or enter 'STOP' to end: ");

			input = in.next();
			
			if(input.equals("STOP")) {
				stop = true;
				counter --;
				
			}// if 
			else {
				arrayString[counter] = input;
				counter ++;
			}//else
		}// while
	}// load method
	
	
	// returns true or false if inWord is in array or not
	public boolean search(String inWord) {
		boolean inArray = false;
		
		for(int i =0; i<= counter; i++) {
			if (arrayString[i].contentEquals(inWord)) {
				inArray = true;
			}//if 
		}// for
		return inArray;
		
	}// search method
	
	//method to return the string in the array which has the highest position in the lexicographic ordering
	public String findMax() {
		for(int i = 0; i<= counter; i++) {
			if(i==0) {
				max = arrayString[i];
				
			}//if
			else {
				if (arrayString[i].compareTo(max)>0) {
					max = arrayString[i];
				}// if
			}//else
		}// for
		return max;
	}// findMax method
	
	// method to return string in the array that has the lowest lexicographic ordering
	public String findMin() {
		for (int i=0; i<=counter; i++) {
			if(i==0) {
				min = arrayString[i];
			}//if
			else {
				if(arrayString[i].compareTo(min)< 0) {
					min = arrayString[i];
				}//if
			}//else
		}//for
		return min;
	}//findMin method
	
	
	// method that returns the longest string in the array
	public String findLongest() {
		String longest= "";
		int same = Integer.MIN_VALUE;
		for (int i=0; i <= counter; i++) {
			if(arrayString[i].length() == same) {
				longest += ", " + arrayString[i];
			}
			else if(arrayString[i].length() >= same) {
				longest = arrayString[i];
				same = arrayString[i].length();
			}//if
		}//for
		return longest;
		
	}// findLongest method
	
	// method that returns shortest string in array
	public String findShortest() {
		String shortest = "";
		int same = Integer.MAX_VALUE;
		for(int i=0; i<= counter; i++) {
			if(arrayString[i].length() == same ) {
				shortest += ", " + arrayString[i];
			}//if
			else if(arrayString[i].length() <= same) {
				shortest = arrayString[i];
				same = arrayString[i].length();
				
			}// else if
			
		}//for
		return shortest;
		
	}// findLongest method
	
	
	
	
	
}// public class MyClass
	
	
	

	