package labnine;

public class ExerciseFiveMain {

	public static void main(String[] args) {

		// declare another reference to interface
		// assign a lambda expression to it
		ExerciseFive factorial = (n) -> {

			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};

		System.out.println("factorial of 5 = " + factorial.func(5));
	}
}
