package day10loops;
import java.util.Scanner;

public class WhileLoop03 {
	
/*
Type java code by using while loop, 
Write a program that prompts the user to input an integer. 
It should then find the sum of the digits of that number. 
123 ==> 1+2+3 = 6
*/
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an integer to find the sum of the digits...");
	int num = scan.nextInt();
		
	if(num<0) {
	num = -1*num;
	}   // you do not need this part as the code works for both positive and negative numbers.
// 1st way:
	int sum = 0;
	while (num!=0) {		
	sum = sum + num%10;			
	num = num/10;			
	}
	System.out.println(sum);
// 2nd way:
	int sumOfDigits=0;
	for(int i=1234  ;    i>0       ;     i=i/10     ) {
	sumOfDigits = sumOfDigits +  i%10;
	}
	System.out.println(sumOfDigits);
	}	}