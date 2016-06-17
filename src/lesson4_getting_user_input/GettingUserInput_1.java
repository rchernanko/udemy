package lesson4_getting_user_input;

import java.util.Scanner;

public class GettingUserInput_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Scanner class will allow the user to input something, integers,
		// strings etc. The standard way to 'input' = System.in.

		System.out.println("Enter a number");
		// Prompts the user to input something

		int value = input.nextInt();
		// The user has inputted something

		System.out.println("You have entered " + value);
		// The system class prints out the value that was entered by the user.

	}

}
