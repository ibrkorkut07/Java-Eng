package day09loops;
public class ForLoop01 {
public static void main(String[] args) {
		
//*   1)Type code to print unique characters on the console
	String s1 = "Ann";
	for(int i=0; i<s1.length(); i++) {			
	char c = s1.charAt(i);
	if(s1.indexOf(c)==s1.lastIndexOf(c)) {				
	System.out.print(c);				
	}   }
//   2)Type code to print a String in reverse after removing spaces
//   Example: Ali Can ==> naCilA
	String s2 = "A Ca";
	String reversed = "";
	for(int i=s2.length()-1; i>=0; i--) {		
	String c = s2.substring(i, i+1);
	if(c.equals(" ")) {					
	s2 = s2.replace(" ", "");					
	} else {				
	reversed = reversed + c;			    
	}   }	
	System.out.println(reversed);
	}   }
