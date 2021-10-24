/*The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it.
 *  Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 */
package firstlab;

import java.util.Scanner;

public class ThirdExercise {
	public static void main(String[] args) {
		System.out.println("Enter the number n to print the fibbnacci series ");
		Scanner ob = new Scanner(System.in);
		short a = ob.nextShort();
		Series ob1 = new Series();
		long b = ob1.input(a);
		System.out.println("The " + a + "th number of the fibbnacci series is " + b);
	}
}
class Series {
	int a = 1;
	int b = 1;
	int c = 0;
	int count;
	int input(int a) {
		count = a;
		count = fabo(count);//calling the method passing an  int argument
		return count;
	}
	int fabo(int count) {
		if (count != 2) {
			c = a + b;
			a = b;
			b = c;
			fabo(--count);
		}
		return c;
	}
}
