package labnine;

interface Excp
{
	void Remove(String a);
}
public class ExerciseTwo {
public static void main(String[] args) {
	
	Excp exr=(a)->System.out.println("Space inserted between two characters"+" "+a);
	exr.Remove("C"+"  "+"G");
}
}
