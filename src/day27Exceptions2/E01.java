package day27Exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	1) FileNotFoundException:
 	   a) The file with a specified path does not exist
 	   b) If it is unaccessible
 	2) IOException:
 	   a) It can handle all input and output exceptions
 	Note: IOException is the parent of FileNotFoundException
 	Note: If you use IOException Class, no need to use FileNotFoundException Class
 	Note: When you see an exception, you have two options
 		  a) Using "throws" declaration in the method name line
 		  b) Using try-catch block
*/
public class E01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src\\day27Exceptions2\\Textfile01");
		int i = 0;
		
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
	}

}
