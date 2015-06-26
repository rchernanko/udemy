package recursion;

public class App {

    public static void main(String[] args) {
        int number = 4;
        calculate(number);
        calculateAgain(number);
    }

    //The reason for the below method, calculate, being static is that I do not want to create an object instance
    //of "App" in order to call the calculate method (e.g. app.calculate). Instead, with a static method, I can call
    //the calculate method directly in my main method, without the need to instantiate any App object.

    private static void calculate(int initialNumber) {
        initialNumber = initialNumber - 1;
//        System.out.println(initialNumber);
    }

    //With the above, it's important to realise that whatever I do with 'initialNumber' within the calculate
    //method (i.e. within its { and }), this will have no impact on the variable 'value' declared in the main method
    //(i.e. the value in the variable 'value' will not change - to be honest, the "void" is a giveaway there!).

    //The video tutorial simply uses 1 calculate method, but I will create another one (calculateAgain), as I want the
    //illustrated points above to make sense!

    ////// RECURSION //////

    //So the e.g. calculate method can call itself and this is what is known as recursion.
    //You call a method 'recursively'

    //Have a look in my calculateAgain method below - I am calling the calculateAgain method recursively

    private static void calculateAgain(int initialNumber) {
        System.out.println(initialNumber);
        calculateAgain(initialNumber);
    }

    //But if we run the above, we will get an error, a StackOverflowError
    //"Exception in thread "main" java.lang.StackOverflowError"

    //When you call a method from within another method, there is a special area of memory in the JVM called the "Stack"
    //The Stack is used for local variables and remembering which methods called which methods (so that they return
    //successfully etc)

    //The Stack also have many other uses that no doubt I will discover while reading head first java.
    //The Stack is different to the "Heap" in that the Heap stores objects (i.e. when you write "new App();")

    //And so in the above, we are seeing the StackOverflowError because we are calling the calculateAgain method
    //recursively an infinite amount of times - we are not telling it to stop. And the Stack doesn't have enough memory
    //to keep supporting this request!
}
