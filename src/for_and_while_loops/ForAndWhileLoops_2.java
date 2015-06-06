package for_and_while_loops;

public class ForAndWhileLoops_2 {
	public static void main(String[] args) {

		boolean loop1 = true;
		System.out.println(loop1);

		boolean loop2 = 4 < 2;
		// If 4 is less than 2, the variable is true.
		// If 4 is not less than 2 (which it isn't), the variable is false.

		System.out.println(loop2);
		// I would expect 'false' to be printed as 4 is not less than 2.

		int value = 10;
		boolean loop3 = value < 20;
		// If the value in the variable named value is less than 20, then this is true.
		// If the value in the variable named value is not less than 20, then this is false.

		System.out.println(loop3);
		
		int value2 = 15;
		while (value2 < 32)
		{
			System.out.println("Hello" + value2);
			// If i run this without the below code line, the loop will keep being executed and my console will not
			// stop until I tell it too :-)
			
			value2 = value2 + 1;

			//The above is basically saying. While the value is less than 20, print out the statement and then add 1
			// to the value within the variable 'value'.
		}
				
	}
}