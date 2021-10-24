//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number
/*import the scanner the class for input from the user
 * using while loop if the input of the user not equal to the zero
 */
package firstlab;

import java.util.Scanner;
public class FirstExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int a = sc.nextInt();
		int sum = 0;
		int n;
		while (a != 0) {
			n = a % 10;// Module by 10 gives the output of the Remainder
			sum = sum + (n * n * n);
			a = a / 10;// divisible by 10 gives the quotient
		}
		System.out.println("Sum of the cubes of the digits are" + "  " + sum);
	}
}
