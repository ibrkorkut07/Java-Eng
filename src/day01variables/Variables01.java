package day01variables;

public class Variables01 {

	// statements in Java = sentences in English and ; in Java = . in English
	// How to build variables? Type;
	// 1) access modifier	2) date type	3) a name for the variable	4) =	5) a value for the variable		6) ;
	
	public static void main (String [] args) {
		int age = 12;
		// :public int age" is variable declaration
		// "= 12" is value assignment
		System.out.println(age);
		int height = 5; // If you declare a variable without assigning any value in the main method, 
						// you will get a red underline when you try to use it.
		System.out.println(height);
		// declare a char variable
		char initial;
		// assign a value
		initial = 'S';
		System.out.println(initial);
	}
}
