package edu.monmouth.cs176.s1160162.mp3;

public class MyClass2Tester {
	
public static void main(String[] args) {
		
		MyClass2 classTester = new MyClass2();

		classTester.load();
		
		classTester.search(24);
		
		classTester.findMax();
		
		classTester.findMin();
		
		classTester.findMaxPos();
		
		classTester.findMinPos();

		System.out.println("The number search was found:" + classTester.search(24));
		
		System.out.println("The maximum value entered: " + classTester.findMax());
		
		System.out.println("The minimum value entered: " + classTester.findMin());
		
		System.out.println("The maximum index value position: " + classTester.findMaxPos());
		
		System.out.print("The minimum index value position: " + classTester.findMinPos());

	}

}
