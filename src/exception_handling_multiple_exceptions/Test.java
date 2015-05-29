/*

This tutorial looks at how to throw multiple exceptions from a method and also how to handle them

 */

package exception_handling_multiple_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {

    //Let's imagine that the 'run' method could throw an exception...notice that I am using throws after the method name

    public void run() throws IOException {
        throw new IOException();
    }

    //But what if I want to throw another exception in the above method?

    //In the below, let's say that the IOException wasn't thrown but that something else was...
    //FYI - I have commented out the "throw new IOException();" below but let's imagine that it's not

    public void run2() throws IOException, ParseException {
        // throw new IOException();
        throw new ParseException("Error message being thrown", 2);
    }

    //In the above, you can see that there is a comma separated list of exceptions in the method signature
    //What this means is that the run2 method COULD throw either an IOException or a ParseException if either one is detected
    //Note that you will only ever throw one exception at a time, you can't throw more than one

    //So run2 has now "thrown" the exceptions back to the main method (in App.java in this package), let's see how
    //we should handle this (go to App.java)

    //The below method is used to demonstrate a little complication when handling multiple exceptions (involves Polymorphism)
    //The below needs to be read in conjunction with the App.java class in this package

    public void input() throws IOException, FileNotFoundException{
    }

    //In the above method, FileNotFoundException is a child class of IOException

}
