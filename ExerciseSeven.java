package sixthlab;
	import java.util.*;
	public class ExerciseSeven {
	  
	    // function reverses the elements of the array
	    static int reverse(Integer a[], int i)
	    {
	        Collections.reverse(Arrays.asList(a));
	        System.out.println(Arrays.asList(a));
			return i ;
	    }
	  
	    public static void main(String[] args)
	    {
	        Integer [] arr = {10, 20, 30, 40, 50};
	        System.out.println(reverse(arr,10));
	    }
	}

