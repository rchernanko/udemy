package exception_handling_runtime_exceptions;

public class App {

    /*

    There are 2 basic kinds of exceptions in Java

    1) Checked exceptions - these are ones you're forced to handle in the code (see my other exception_handling classes and notes)

    2) Unchecked exceptions (aka runtime exceptions) - you are not forced to handle these - the code will compile without
    you handling the exception BUT you will get an error when trying to run the code

     */

    public static void main(String[] args) {

        // **** Example 1 ****


        //Below is an example of an unchecked / runtime exception - division by 0.
        //Notice that I don't need to handle this with a try / catch block OR throw an exception

        int value = 7;

        value = value/0;

        //So as you can see from the above, the code is compiling fine (the only reason the second 'value' is underlined
        //is because it's not being used at present - not because it is a checked exception that needs to be handled)

        //However, if I then try to run App.java, I will see a runtime exception:
        // "Exception in thread "main" java.lang.ArithmeticException: / by zero"

        //What's really useful and interesting is that if I go to the Java APIs website and navigate to ArithmeticException,
        //it is a subclass of RuntimeException (which in turn is a child class of the Exception class)


        //So why do I have to handle some exceptions and not handle others???

        //The idea is that runtime errors are basic fundamental errors with your code itself. So if you've got a runtime
        //exception, it's something that your program is unlikely to recover from + you've basically forgotten to do
        //something when you were writing the code.

        //Runtime Exceptions = Not good, something wrong with your code



        // **** Example 2 ****

        //Another example of a runtime exception is a NullPointerException, as below:

        String text = null;

        System.out.println(text.length());

        //In the above, the compiler is happy because I have initialised the reference 'text' with something (even though
        //it is not pointing at an object). Therefore the code compiles sucessfully.

        //However, because the reference 'text' is not pointing to an object containing actual code / implemetation for
        //the text.length method call, a NullPointerException is thrown:

        //"Exception in thread \"main\" java.lang.NullPointerException"




        // **** Example 3 ****

        //Another example is the ArrayIndexOutOfBoundsException, as below:

        String[] texts = {"one", "two", "three"};

        System.out.println(texts[3]);

        //If I run the above, String array 3 does not exist (0 = one, 1 = two and 2 = three)
        //Therefore when I run the above, I see an ArrayIndexOutOfBoundsException

        //"Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3"



        //You can of course still handle 'unchecked exceptions' (with a try / catch block + throws)

        //However, runtime exceptions point to really fundamental problems in your code + so it's best to just make
        //sure you're coding correctly in the first place!





    }


}
