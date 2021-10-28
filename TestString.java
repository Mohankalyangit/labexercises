package secondlab;

import java.util.Scanner;
import java.io.*;

public class TestString {

	public static void main(String[] args)throws IOException {
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.next();
		//char[] ch = new char[100];
		
		StringTest st = new StringTest(str);
		//System.out.println("input taken");
		st.stringPositive();
	
	}


}
