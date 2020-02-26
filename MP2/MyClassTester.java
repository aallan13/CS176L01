package edu.monmouth.cs176.s1160162.mp3;

public class MyClassTester {
	
	public static void main(String[] args) {

		MyClass classTest = new MyClass();

		classTest.load();
		
		classTest.search("kobe");
		
	

		System.out.println("The search was found:" + classTest.search("kobe"));
		
		System.out.println("The highest string entered Lexicographically: " + classTest.findMax());
		
		System.out.println("The lowest string entered Lexicographically: " + classTest.findMin());
		
		System.out.println("The longest string length: " + classTest.findLongest());
		
		System.out.print("The shortest string length: " + classTest.findShortest());
		

	}

}
