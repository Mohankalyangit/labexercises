/*Create a method to check if a number is an increasing number
 * Method Name 	checkNumber 
Method Description 	Check if a number is an increasing number 
Argument 	int number 
Return Type 	boolean 
Logic 	A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
For Example : 134468 is an increasing number 

 */
package firstlab;

public class ExerciseSeven {
	public static boolean checkNumber(int n) {
		int currentDigit = n % 10;// Module by 10 gives the remainder
		n = n / 10;// divisible by 10 gives the quotient value
		while (n > 0) {
			if (currentDigit <= n % 10) {
				return false;
			}
			currentDigit = n % 10;
			n = n / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkNumber(21));// calling the method by passing the int argument
	}
}
