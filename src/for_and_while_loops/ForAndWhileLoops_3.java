package for_and_while_loops;

public class ForAndWhileLoops_3 {
	public static void main(String[] args) {
		double myDouble = 1.0;

		while (myDouble < 2.0) {

			myDouble = myDouble + 0.5;

			System.out.println("The price of my beer is : " + myDouble);

			//When executed, the above 2 lines will print different values in the sout, depending on which line comes fist.
			//So if i move sout to above the myDouble, I would receive different printed values
		}

		int myAge = 13;

		while (myAge < 20) {

			System.out.println("Because I am " + myAge
					+ ", I am still a teenager.");

			myAge = myAge+ + 1;

		}

		int myWallet = 10;

		while (myWallet > 5) {

			System.out
					.println("I have " + myWallet + " pounds in my wallet - wooo!!!");

			myWallet = myWallet - 1;

		}

	}
}
