/*Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
 * 
 */
package firstlab;

import java.util.Scanner;

public class FourthExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between " + start + " and " + end + " are : ");
		int count;
		for (int i = start; i <= end; i++) {
			count = 0;//writing inside for loop in the outer for loop
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.println(i);//printing the all the prime numbers from start to the end
		}
		sc.close();
	}
}

