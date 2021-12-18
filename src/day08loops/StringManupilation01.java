package day08loops;
import java.util.Scanner;

public class StringManupilation01 {
/*  Ask the user to enter SSN (9 digits)  
 	Print the SSN on the console after converting the first 5 digits into *
 	Example: 123456789 ==> *****6789
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your SSN number");
		String ssn = scan.next();
		
		String lastFourDigits = ssn.substring(5);
		String firstFiveDigits = "*****";
		System.out.println(firstFiveDigits + lastFourDigits);
		scan.close ();
}   }
