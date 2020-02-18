package edu.monmouth.cs176.s1160162.mp3;

public class MyClass2Tester {
	
public static void main(String[] args) {
		
		MyClass2 classTester = new MyClass2(100);

		classTester.load();
		
		classTester.search(1);
		
		classTester.findMax();
		
		classTester.findMin();
		
		classTester.findMaxPos();
		
		classTester.findMinPos();

		System.out.println("The search was found:" + classTester.search(1));
		
		System.out.println("The maximum value entered: " + classTester.findMax());
		
		System.out.println("The minimum value entered: " + classTester.findMin());
		
		System.out.println("The maximum index value position: " + classTester.findMaxPos());
		
		System.out.print("The minimum index value position: " + classTester.findMinPos());

	}

}
