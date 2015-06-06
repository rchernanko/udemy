package for_and_while_loops;

public class ForAndWhileLoops_3 {
	public static void main(String[] args) {

		double myDouble = 1.0;
		while (myDouble < 2.0) {
			myDouble = myDouble + 0.5;
			System.out.println("The price of my beer is : " + myDouble);
		}

		int myAge = 13;
		while (myAge < 20) {
			System.out.println("Because I am " + myAge
					+ ", I am still a teenager.");
			myAge = myAge+ + 1;
		} System.out.println("I'm not a teenager anymore, wooo!!");

		int myWallet = 10;
		while (myWallet > 5) {
			System.out
					.println("I have " + myWallet + " pounds in my wallet - wooo!!!");
			myWallet = myWallet - 1;
		} System.out.println("Oh no, I only have a fiver left...");

	}
}
