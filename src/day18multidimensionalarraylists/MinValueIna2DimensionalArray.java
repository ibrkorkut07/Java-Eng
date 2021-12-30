package day18multidimensionalarraylists;

//Homework: Type the code to find the minimum value in a 2-dimensional array
public class MinValueIna2DimensionalArray {
	
public static void main(String[] args) {
int arr[][] = { {-1, -3, 0,1,2}, {65, 73, 78}, {80, 86, 90}};
int sum = 0;
	for(int[] w : arr) {      
     	sum = sum + w.length;           
 	}
       	int x = Integer.MAX_VALUE;
 	for(int[] w : arr) {
     		for(int y : w) {
         			if(x > y) {                  
             		x = y;                  
         		}   }   }
 	System.out.println("Minimum Element: " + x);
}
}