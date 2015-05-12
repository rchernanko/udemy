package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddExceptionToMethodSignature {

    public static void main(String[] args)
            throws FileNotFoundException {

        //Exceptions are a major part of the Java language
        //An exception is part of error-handling mechanism
        //FYI - An Exception is just another object / class

        File file = new File("test.txt");

        //There is a class called File, as above. In the constructor of File, I can pass a file name into it

        //If I wanted to read the file, test.txt, the next step could be to declare a FileReader class, as below:

        FileReader fr = new FileReader(file);

        //(Before I add "throw" to the method signature), when I just write "FileReader fr = new FileReader(file);", I
        //receive an error ("unhandled exception").

        //Whenever you get an "unhandled exception", there are 2 ways to handle it:

        //1) Add Exception to the method signature
        //2) Surround with try/catch

        //In this class, I will demonstrate the first choice, and I will create another class in this package for no. 2

        //If I choose to implement the first option, "throws FileNotFoundException" is added to my method signature, and
        //the error lines underneath "new FileReader(file);" disappear (see above).

        //If I were to run this class now, my 'stack trace' in the console would be red and show an error (because there is no text.txt in my project)

        //In the stack trace, the line at the very top will tell you why your error occurred. In this instance:
        //"Exception in thread "main" java.io.FileNotFoundException: test.txt (No such file or directory)"

        //If I also look further down in the stack trace, I can also understand where in my code this FileNotFoundException
        //has been thrown - App.java:22.

        //So the fact that I've added "throw" to my method signature allows me to highlight why and where the exception occurred.

        //Basically the line "FileReader fr = new FileReader();" encounters an error and reacts by "throwing" an
        //Exception object out of itself - in this case, it's thrown an Exception out of the main method (as you can see in the stack trace)
        //This "throwing" was possible because of the "throws FileNotFoundException" in the method signature

    }
}