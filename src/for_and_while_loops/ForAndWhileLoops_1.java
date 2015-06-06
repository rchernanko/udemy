package for_and_while_loops;

public class ForAndWhileLoops_1 {

	public static void main(String[] args) {

		for (int stomachSize = 40; stomachSize > 30; stomachSize = stomachSize - 2) {
			//1st part of bracket declares and initialises my variable.
			//2nd part of bracket is the condition I want to test (similar to the while condition) - so in this instance = While the value in the variable stomachSize is more than 30
			//If the condition is met, I then first execute the code underneath my brackets (e.g. System.out.println...)
			//Once this code has been executed, I then return to the brackets and execute the 3rd part.
			//In this instance, I am now asking the value in the variable stomachSize to be decreased by a value of 2 (each time the loop is run)

			System.out.println("You are size " + stomachSize
					+ ". You still need to lose some weight fatty.");
		}

		for (int pintPrice = 10; pintPrice > 3; pintPrice--) {
			System.out.printf("The price of a pint is currently %d\n",
					pintPrice);

		}
		
		//Notice the printf in the above. This = (format, argument). Also the %d allows me to print the value in the variable pintPrice. The %d is specific to integer primitive values.
		//Also notice the \n = this is a quicker way of writing System.out.println();

		for (double currentCount = 15.00; currentCount != 19.00 ; currentCount = currentCount + 1.00) {
			System.out.println("The current count is " + currentCount);
		}
		
		int numberOfSandwichesEaten = 10;
		while (numberOfSandwichesEaten < 20){
			System.out.println("I'm still bloody hungry! I've only had " + numberOfSandwichesEaten + " sandwiches today.");
			numberOfSandwichesEaten = numberOfSandwichesEaten + 1;
		}
		
		int numberOfPoints = 10;
		
		while (numberOfPoints < 20){
			
			System.out.println("You only have " + numberOfPoints + " points. You need to try again.");
			
			numberOfPoints = numberOfPoints + 1;
		}
		
		for (int numberOfCards = 5; numberOfCards < 10 ; numberOfCards = numberOfCards + 1){
			
			System.out.printf("You have this many cards : %d\n", numberOfCards); 
		}
	}
}
