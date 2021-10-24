/*Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * Method Name 	calculateSum 
Method Description 	Calculate Sum 
Argument 	int n 
Return Type 	int-sum 
Logic 	Calculate the sum of first n natural numbers which are divisible by 3 or 5. 
 */
package firstlab;

import java.util.Scanner;

public class ExerciseFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int i, sum = 0;
		for (i = 0; i <= n; i++) {
			sum = sum + i;//adding the sum with input number
		}
		System.out.println("Sum of first " + n + "natural numbers=" + sum);
		if (sum % 3 == 0 || sum % 5 == 0) {
			System.out.println("Sum of the number is divisible by 3 or 5");
		} else {
			System.out.println("the number is not divisible by 3 or 5");
		}
	}
}
