package day27Exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
/*
 	1) You can use multiple catch blocks for a single try block
 	2) Order the exception classes from child to parent if you use multiple catch blocks.
 	   Otherwise, you will get Compile Time Error. 
 	3) You can get different messages for every exception if you use multiple catch blocks
 	4) Try block cannot be used alone
 	5) If you get red underline when you type a code for exceptions, that kind of exceptions are called "checked exceptions"
 	   If you do not get red underline for some exceptions, that kind of exceptions are called "unchecked exceptions"
 	   FileNotFoundException and io.IOException are "checked exceptions"
 	6) Java stops execution if there is an unsolved exception
 	7) You can use throws or try-catch blocks to deal with exceptions but prefer try-catch
 */

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src\\day27Exceptions2n\\Textfile01"); //  it is a broken path
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("I think the path is wrong or the file does not exist " + e.getMessage());
			e.printStackTrace();   // gives a detailed error message - no need to write System.out.print();
			System.out.println(e.getMessage());   //  gives a short message
		} catch (IOException e) {
			System.out.println("There are some issues in reading the file"); 
		}  }  }  