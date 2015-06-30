package recursion;

public class App {

    public static void main(String[] args) {
        int number = 4;
        calculate(number);
//        calculateAgain(number);
//        calculateAgain2(number);
        System.out.println(calculateFactorialNumber(number));

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

    //So the calculate method can call itself and this is what is known as recursion.
    //You call a method 'recursively'

    //Have a look in my calculateAgain method below - I am calling the calculateAgain method recursively

//    private static void calculateAgain(int initialNumber) {
//        System.out.println(initialNumber);
//        calculateAgain(initialNumber - 1);
//    }

    //But if we run the above, we will get an error, a StackOverflowError
    //"Exception in thread "main" java.lang.StackOverflowError"

    //When you call a method from within another method, there is a special area of memory in the JVM called the
    //"Stack", which is used.
    //The Stack is used for local variables and remembering which methods called which methods (so that they return
    //successfully etc)

    //The Stack also has many other uses that no doubt I will discover while reading head first java.
    //The Stack is different to the "Heap" in that the Heap stores objects (i.e. when you write "new App();")

    //And so in the above, we are seeing the StackOverflowError because we are calling the calculateAgain method
    //recursively an infinite amount of times - we are not telling it to stop. And the Stack doesn't have enough memory
    //to keep supporting this request (I think this is the correct reasoning anyway!).

    //Of course, getting "calculateAgain" to recursively call itself is fine, providing that there is some sort of way
    //for it (calculateAgain) to know that it can stop calling itself. So what we could do is add an IF statement:

    //(Again, I am creating another calculateAgain method below because I don't want to lose the stuff above!):

    private static void calculateAgain2(int initialNumber) {
        System.out.println(initialNumber);
        if(initialNumber == 1) {
            return;
            //Even though the method uses "void", if I write "return" on it's own, nothing will actually be returned
            //, and the code will still compile
        }
        calculateAgain2(initialNumber - 1);
    }

    //We can do useful stuff with recursion, a classic example being how to calculate a factorial value

    //A factorial value is:
    //e.g. Factorial 4 = 4x3x2x1
    //e.g. Factorial 5 = 5x4x3x2x1
    //etc etc

    private static int calculateFactorialNumber(int factorial) {
        System.out.println(factorial);
        if(factorial == 1) {
            return 1;
        }
        return calculateFactorialNumber(factorial - 1) * factorial;
    }

    //Initially, I couldn't really get my head around the above. If I feed in 4, then why oh why does it return 24 (in
    //terms of how does this return 24 programatically).

    //So sat down with Elizabeth and we wrote it down together:

    /*

    f = function

    f(4)
    =f(3) * 4
    =f(2) * 3 * 4
    =f(1) * 2 * 3 * 4

    Last multiplication gives you 24

    So the previous '*' is remembered...

     */

    //John also recommends looking at the Tower of Hanoi puzzle and trying to replicate that!
}
