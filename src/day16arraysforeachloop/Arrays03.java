package day16arraysforeachloop;
import java.util.Arrays;
public class Arrays03 {

//   Check if a specific element exists in an array 
public static void main(String[] args) {
int arr[] = {12, 21, 34};

//   1.Way:
int expectedElement = 12;
int counter = 0;

for(int i=0; i<arr.length; i++) { 
if(expectedElement == arr[i]) {
counter++;
break;
}  
}

if(counter == 1 ) {
System.out.println(expectedElement + " exists in the array.");
} else {
System.out.println(expectedElement + " does not exist in the array."); 
}
/*   
2.Way:
a) binarySearch() returns the index of the expected element if the element exists
b) binarySearch() returns negative integers for non-existing elements. The value represents the order number if the element exists.
c) Before using binarySearch() method you have to use sort() otherwise to output you got does not have any meaning
d) binarySearch does not give stable output for repeated numbers
*/
Arrays.sort(arr); 
System.out.println("Binary Search Result: " + Arrays.binarySearch(arr, expectedElement)); 
}}
