package working_with_variables;

public class WorkingWithVariables_1 {

	public static void main(String[] args) {
		int myNumber;
		//Here I have declared my variable. Think of a variable as a box in which I can put something.
		
		myNumber = 88;
		//Here I am initialising my variable. I have put the integral (whole number) value 88 into my box.
		
		//In the above, I have declared and initialised my variable on 2 separate lines. But this can actually be done in 1 line.
		//int myNumber = 88;
		
		//Some more examples of 'boxes':
		
		short myShort = 839;
		long myLong = 3343654L;
		double myDouble = 734534.34;
		float myFloat = 354.21F;
		//Always remember to put an F onto a float. If not, the value will default to a double. 
		//Float is a smaller version of a double 'box' (primitive variable)
		
		char myChar = 's';
		boolean myBoolean = true;
		byte myByte = 43;
		//byte can only hold 8 bits of data. negative or positive. up to 128 i think.
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
	}

}
