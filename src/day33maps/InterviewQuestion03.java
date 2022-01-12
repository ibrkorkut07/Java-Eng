package day33maps;

public class InterviewQuestion03 {

	public static void main(String[] args) {
		
		int numOfRows = 5;
		
		for(int i=numOfRows; i>=1; i--) {
			
			for(int space=0; space<numOfRows-i; space++) {
				System.out.print("  ");
			}
			
			for(int k=0; k<2*i-1; k++) {
				System.out.print("* ");
			}
			
			System.out.println();	
		}
	}
}