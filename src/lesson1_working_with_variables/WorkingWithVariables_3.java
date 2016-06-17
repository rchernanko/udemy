package lesson1_working_with_variables;

public class WorkingWithVariables_3 {
	public static void main(String[] args) {
		
		int myInt = 7;
		
		String text = "hello";
		//The reason String is spelt with a capital S is because it is a class, NOT a primitive type.
		//String = a class. This just means its a type of object that can hold text.
		//"hello" is an instance of the String class, i.e. an object.
		
		String blank = " ";
		String name = "Bob";
		String greeting = text + blank + name;
		
		System.out.println(greeting);
		
		//the same thing as the above can be achieved just by using System.out.println("Hello bob");
		
		System.out.println("Hello" + " " + "Bob");
		
		System.out.println("My Integer is: " + myInt);
		
		double myDouble = 7.8;
		
		System.out.println("My number is: " + myDouble);
		
		String firstInitial = "R";
		String secondInitial = "J";
		String lastInitial = "C";
		String fullInitials = firstInitial + secondInitial + lastInitial;
		
		System.out.println("My Initials are: " + fullInitials);
		
		byte testByte = 23;
		String testString = "are two of our own";
		
		System.out.println("Here come my initials " + fullInitials + " and Jody and Gabi " + testString + ". And a few years ago I was " + testByte);
		
	}
}
