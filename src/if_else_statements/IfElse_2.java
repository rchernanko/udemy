package if_else_statements;

import java.util.Scanner;

public class IfElse_2 {
	public static void main(String[] args) {
		
		int myAge;
		Scanner inputAge = new Scanner(System.in);
		System.out.println("Please enter my age");
		myAge = inputAge.nextInt();

		if (myAge <= 20){
			System.out.println("I am younger than 20. I am currently " + myAge + " years old");
		} else if (myAge >= 30){
			System.out.println("I am older than 30. I am currently " + myAge + " years old");
		} else {
			System.out.println("I am between 21 and 29 years old. My current age is " + myAge);
		}
	}
}
