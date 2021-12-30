package day14statickeywordandarrays;
import java.util.Arrays;
public class Arrays01 {
	
/*
1) Arrays are used to store multiple data in a single container.
2) In an array all elements must be in same data type.
3) Arrays accept just "primitives" and "references" as data type, you cannot store "non-primitive" data types in an array theoretically.
4) Arrays are non-primitive
5) When you create an Array, you have to declare the maximum number of elements(capacity)
*/
	public static void main(String[] args) {

// How to create an Array
	int arr1[] = new int[5];    //   int[] arr1 = new int[5]; and int []arr1 = new int[5]; 
		
// How to print an Array on the console
	System.out.println(Arrays.toString(arr1));   //   [0, 0, 0, 0, 0]
// How to add elements into an Array
	arr1[1] = 11;
	System.out.println(Arrays.toString(arr1));   //   [0, 11, 0, 0, 0]
		
	arr1[4] = 25;
	System.out.println(Arrays.toString(arr1));   //   [0, 11, 0, 0, 25]
				
	arr1[0] = 23;
	arr1[2] = 32;
	arr1[3] = 12;
	System.out.println(Arrays.toString(arr1));   //   [23, 11, 32, 12, 25]
		
//  How to read specific element from an Array
	System.out.println(arr1[2]);   //   32

//   make second element 7, third element 10
	arr1[1]=7;
	arr1[2]=10;
	System.out.println(Arrays.toString(arr1));   //   [4, 7, 10, 8]
		
//	System.out.println(arr1[5]);   //   No red underline so no "Compile Time Error"
//	ArrayIndexOutOfBoundsException: If you get that kind of error messages on the console after running the code, it is called "Runtime Time Error"
		
//  How to get the number of elements in an Array
	System.out.println(arr1.length);   //   5 ==> In Strings we use "length()", in Arrays we use "length"
		
//   How to get the last element from an Array dynamically
	System.out.println(arr1[arr1.length-1]);   //   25
	 
//   How to get the first element
	System.out.println(arr1[0]);   //   4
		
//   How to put elements in ascending order
	Arrays.sort(arr1);   //   sort() method updates array
	System.out.println(Arrays.toString(arr1));   //   [4, 7, 8, 10]
		
/*   How to print the smallest element on the console. Firstly we use sort() method to put elements from smallest to biggest, then the element with "index 0" is the smallest element
*/
	System.out.println(arr1[0]);
		
/*  How to print the biggest element on the console. Firstly we use sort() method to put elements from smallest to biggest, then the element with "index 'arr1.length-1' " is the biggest element
*/
	System.out.println(arr1[arr1.length-1]);   //   10
		
//   Create a String Array, put "Ali", "Veli", "Mete", "Can" as elements
//   sort the elements
//   find the last element after sort() method
	 String arr5[] = {"Ali", "Veli", "Mete","Can"};
Arrays.sort(arr5);
	System.out.println(Arrays.toString(arr5));
	System.out.println(arr5[arr5.length-1]);
	}   }
