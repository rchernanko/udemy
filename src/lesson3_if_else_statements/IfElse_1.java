package lesson3_if_else_statements;

import java.util.Scanner;

public class IfElse_1 {

	public static void main(String[] args) {

		double myDouble;
		// declaring my variable

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter a number");
		myDouble = scanner1.nextDouble();
		if (myDouble != 5.0) {
			// if the variable myDouble is not equal to the value of 5
			System.out.println("Yes this is true! My double is " + myDouble);
			// print the above
		} else
			// else if the variable myDouble is equal to the value of 5
			System.out.println("No this is not true. My double is actually "
					+ myDouble);
		// print the above
	}
}