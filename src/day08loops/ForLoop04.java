package day08loops;
public class ForLoop04 {

	public static void main(String[] args) {
	//  A string is given. Create the String which is the reverse of the given String without spaces, then 
	//  print it on  the console like a pyramid.
			
		String s2= "Ali Can";
		String reversed= "";
		for( int i= s2.length()-1 ; i>=0 ; i-- ) {
		String ss=s2.substring(i, i+1);
		if( ! ss.equals(" ")    ) {
		reversed=reversed + ss;
		}
		System.out.println(reversed);
		}  }  }
