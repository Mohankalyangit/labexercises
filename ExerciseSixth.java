/*Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 *Method Name 	calculateDifference 
Method Description 	Calculate the difference 
Argument 	int n 
Return Type 	int - Sum 
Logic 	Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
For Example if n is 10,you have to find 
(1^2+2^2+3^2+….9^2+10^2)- 
(1+2+3+4+5…+9+10)^2 
 
 */
package firstlab;

public class ExerciseSixth {
	public static int calculateDifference(int n) {
		int l, k, m;
		l = (n * (n + 1) * (2 * n + 1)) / 6;	// Sum of the squares of the first n natural numbers is
		k = (n * (n + 1)) / 2;	// Sum of n naturals numbers
		k = k * k;// Square of k
		m = Math.abs(l - k);// Differences between l and k
		return m;
	}
	public static void main(String s[]) {
		int n = 10;
		System.out.println(calculateDifference(n));
	}
}
