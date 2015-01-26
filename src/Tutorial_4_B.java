public class Tutorial_4_B {
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

		}

		int myWallet = 10;

		while (myWallet > 5) {

			System.out
					.println("I have some spending money in my wallet - wooo!!!");

			myWallet = myWallet - 1;

		}

	}
}
