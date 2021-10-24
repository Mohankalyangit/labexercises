/*Create a method to check if a number is a power of two or not
 * Method Name 	checkNumber 
Method Description 	Checks if the entered number is a power of two or not 
Argument 	int n 
Return Type 	boolean 
Logic 	Check if the input is a power of two. 
Ex: 8 is a power of 2 
 */
/*
	 * Check if a number is a power of 2 or not. IF n is power of 2, return 1, else
	 * return 0.
	 */
package firstlab;

public class ExerciseEight {
	static boolean powerOfTwo(int n) {
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			n = n / 2;
			if (n % 2 != 0 && n != 1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(powerOfTwo(8));
	}
}
