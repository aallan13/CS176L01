
package edu.monmouth.cs176.s1160162.mp3;

import java.util.Scanner;

public class MyClass {

	Scanner in = new Scanner(System.in);
	String [] arrayForUser;
	int arrayLen = 0;

	public MyClass(int len) {
		arrayLen = len;
	}// constructor

	public void load() {
		String [] str = new String[arrayLen];
		System.out.print("Enter a string or type Q to quit: ");
		arrayLen = 0;

		for (int i = 0; i < str.length; i++) {
			str[i] = in.nextLine();
			if(str[i].equals("Q")) {
				break;
			}//if
			System.out.print("Enter a string or type Q to quit: ");
			arrayLen++;
		}//for
		arrayForUser = new String[arrayLen];
		for (int i = 0; i < arrayLen; i++) {
			arrayForUser[i] = str[i];
		}//for
	}// load method
	public boolean search(String inWord) {
		boolean ifInWord = false;
		for (int i = 0; i < arrayLen; i++) {
			if (inWord.equals(arrayForUser[i])) {
				ifInWord = true;
			}//if
		}//for
		return ifInWord;
	}// search method

	public String findMax() {
		String high = arrayForUser[0];
		int lexico = 0;
		for (int i = 0; i < arrayLen - 1; i++) {
			if (high.compareTo(arrayForUser[i+1]) == lexico) {
				high += ", " + arrayForUser[i+1];
			}//if
			if (high.compareTo(arrayForUser[i+1]) > lexico) {
				lexico = high.compareTo(arrayForUser[i+1]);
				high = arrayForUser[i];
			}// 2nd if 
		}// for
		return high;
	}// find the max method

	public String findMin() {
		String low = arrayForUser[0];
		int lexico = 0;
		for (int i = 0; i < arrayLen - 1; i++) {
			if (low.compareTo(arrayForUser[i+1]) == lexico) {
				low += ", " + arrayForUser[i+1];
			}//if
			if (low.compareTo(arrayForUser[i+1]) < lexico) {
				lexico = low.compareTo(arrayForUser[i+1]);
				low = arrayForUser[i];
			}// if
		}// for
		return low;
	}// find the minimum method
	
	public String findLongest() {
		String longestStr = null;
		int comparison = Integer.MIN_VALUE;
		for (int i = 0; i < arrayLen; i++) {
			if (arrayForUser[i].length() == comparison) {
				longestStr += ", " + arrayForUser[i];
			}// if
			else if (arrayForUser[i].length() >= comparison) {
				longestStr = arrayForUser[i];
				comparison = arrayForUser[i].length();
			}// else if 
		}// for
		return longestStr;
	}// find the longest string

	public String findShortest() {
		String shortestStr = null;
		int comparison = Integer.MAX_VALUE;
		for (int i = 0; i < arrayLen; i++) {
			if (arrayForUser[i].length() == comparison) {
				shortestStr += ", " + arrayForUser[i];
			}// if 
			else if (arrayForUser[i].length() <= comparison) {
				shortestStr = arrayForUser[i];
				comparison = arrayForUser[i].length();
			}// else if 
		}//for  
		return shortestStr;
	}// find the shortest string 

}// class


