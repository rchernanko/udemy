/*

This tutorial looks at how to throw multiple exceptions from a method and also how to handle multiple them

 */

package exception_handling_multiple_exceptions;

import java.io.IOException;
import java.text.ParseException;

public class Test {

    //Let's imagine that the 'run' method could throw an exception...notice that I am using throws after the method name

    public void run() throws IOException {
        throw new IOException();
    }

    //But what if I want to throw another exception in the above method?
    //In the below, let's say that the IOException wasn't thrown but that something else was...

    public void run2() throws IOException, ParseException {
        // throw new IOException();
        throw new ParseException("Error message being thrown", 2);
    }

    //In the above, you can see that there is a comma separated list of exceptions next to the method name
    //What this means is that you COULD throw either an IOException or a ParseException if either one is detected
    //Note that you will only ever throw one exception at a time, you can't throw more than one

    //So we have now "thrown" the exceptions back to the main method (in App.java in this package), let's see how
    //we should handle this (go to App.java)

}
