package lesson2_for_and_while_loops;

public class WhileIf_1 {
	public static void main(String[] args) {

		int myInt = 1;
		while (myInt >= 1) {

			// while the variable myInt is equal to or more than 1

			System.out.println("myInt is currently : " + myInt);

			// print out the above

			myInt++;

			// then add 1 to the value in my variable myInt
			// If i didn't add the below code, this loop wouldn't stop!

			if (myInt >= 10) {
				break;
			}
			// THE ABOVE 'IF' IS STILL WITHIN THE SAME WHILE LOOP!!! This is key! :-)
			// if the value in myInt is then equal to or more than 10...
			// 'break;' stops the loop.
			// a break can only be used inside a loop or switch
			// if I don't have a break here, the while loop will loop continuously
		}
	}
}
