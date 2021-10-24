/*Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
 *Method Name 	getImage 
Method Description 	Generate the mirror image of a String and add it to the existing string. 
Argument 	String 
Return Type 	String 
Logic 	Accepts One String 
Find the mirror image of the String 
Add the two Strings together separated by a pipe(|) symbol. 
For Example 
Input : EARTH 
Output : EARTH|HTRAE 
Hint: Use StringBuffer API (Ex: For this problem reverse method in Stringbuffer can be used) 
Note: Learn the other APIs in StringBuffer 
 
 */
package thirdlab;

import java.util.Scanner;

public class ExerciseTwo {
	public String getImage(String str) {
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');//pre defined method in the string buffer
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}

	public static void main(String[] ar) {
		ExerciseTwo p = new ExerciseTwo();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.next();
		System.out.println(p.getImage(str));
	}
}
