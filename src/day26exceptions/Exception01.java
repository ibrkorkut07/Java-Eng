package day26exceptions;

/*
 	1) Exception is an "unexpected issue"
 	2) If there is any exception
 		1) stops execution
 		2) throws exception
 	3) Try-block cannot be used alone (use catch or other blocks)
 	4) After try-block, we can use multiple catch blocks
 	5) When you use multiple catch-blocks if there is a parent-child relationship between the exception classes
 	   the child class must be on the top
 	   But if there is no a parent-child relationship, the order is not important.
 */
public class Exception01 {

	public static void main(String[] args) {
		System.out.println(division(12, 3));
		System.out.println(division(10, 10));
		System.out.println(division(0, 10));
		System.out.println(division(10, 0));   //  ArithmeticException
		System.out.println("Hello");
		
		int arr[] = {2,3,7,1,5};
		System.out.println(AddTwoConsecutiveArrayElements(arr, 0));   //  5
		System.out.println(AddTwoConsecutiveArrayElements(arr, 1));   //  10
		System.out.println(AddTwoConsecutiveArrayElements(arr, 2));   //  8
		System.out.println(AddTwoConsecutiveArrayElements(arr, 3));   //  6
		System.out.println(AddTwoConsecutiveArrayElements(arr, 4));   //  ArrayIndexOutOfBoundsException
		
		int brr[] = {12, 6, 0, 1, 1};
		System.out.println(DivideTwoConsecutiveArrayElements(brr, 0));   //  2.0
		System.out.println(DivideTwoConsecutiveArrayElements(brr, 1));   //  ArithmeticException, exception will be handled
		System.out.println(DivideTwoConsecutiveArrayElements(brr, 2));   //  0.0
		System.out.println(DivideTwoConsecutiveArrayElements(brr, 3));   //  1.0
		System.out.println(DivideTwoConsecutiveArrayElements(brr, 4));   //  ArrayIndexOutOfBoundsException, exception will be handled
	}
	
	public static double division(int a, int b) {
		int result = 0;
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by zero - " + e.getMessage());
		}
		return result;
	}
	
	public static int AddTwoConsecutiveArrayElements(int arr [], int index) {
		int result = 0;
		try {
			return arr[index] + arr[index +1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Do not use non-existring indexes - " + e.getMessage());
		}
		return result;
		}
/*	
	public static int DivideTwoConsecutiveArrayElements(int arr [], int index) {
		int result = 0;
		try {
			return arr[index] / arr[index +1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Do not use non-existring indexes - " + e.getMessage());
		}
		return result;
		}
*/	
	public static double DivideTwoConsecutiveArrayElements(int brr [], int index) { // you can use even different array name in the brackets like xrr 
		double result = 0;
		try {
			return brr[index] / brr[index +1];
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by zero - " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Do not use non-existring indexes - " + e.getMessage());
		}
		return result;
		}
	
}
