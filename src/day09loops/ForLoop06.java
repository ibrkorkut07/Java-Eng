package day09loops;

public class ForLoop06 {

	public static void main(String[] args) {
		//   5) Type code to find the sum of the unique digits of an integer.
		String num="1234";
		int sum2=0;
		for( int i=0; i<=num.length()-1 ; i++  ) {
		char c=num.charAt(i);
		if(num.indexOf(c) == num.lastIndexOf(c) ) {
		String sn="" +c;
		sum2=sum2+ Integer.valueOf(sn);
		}   }
		System.out.println(sum2);
		}
		}
