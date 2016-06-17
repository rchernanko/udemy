package lesson4_getting_user_input;

import java.util.Scanner;

public class GettingUserInput_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter some text ");

		String value = input.nextLine();

		System.out.println("You entered the following text: " + value);

	}
}
