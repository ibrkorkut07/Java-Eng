package day09loops;

public class ForLoop05 {

	public static void main(String[] args) {
		//   4) Type code to check if a given String is Palindrome.
		//   String: anna  ---------Reversed String: anna
		//   Integer: 12321 ------ Reversed Integer: 12321
				
			String s3= "1232177777";
			String reversedOfs3 = "";
			for(int i = s3.length()-1 ; i>=0  ;  i--  ) {
			reversedOfs3= reversedOfs3 + s3.charAt(i);
			}
			if(reversedOfs3.equals(s3)) {
			System.out.println(s3 + " is a palindrome");
			} else {
			System.out.println(s3 + " is not a palindrome");
			}
			}
			}
