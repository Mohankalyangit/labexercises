/*Exercise 2: Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons.
 *  On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
 *  Initially there is no message shown.
 */
/*Using Scanner class for input from the user
 * using equals  method for comparing the string 
 */

package firstlab;

import java.util.Scanner;

public class SecondExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the signal :");
		String a = sc.nextLine();//enter the signal 
		System.out.println("you have entered " + a);
		if (a.equals("red")) {
			System.out.println("STOP");
		} else if (a.equals("orange")) {
			System.out.println("READY");
		} else {
			System.out.println("GO");
		}
	}

}
