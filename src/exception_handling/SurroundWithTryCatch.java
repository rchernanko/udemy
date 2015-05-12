//See notes in "AddExceptionToMethodSignature" for much more detailed background

//Whenever you get an "unhandled exception", there are 2 ways to handle it:

//1) Add Exception to the method signature
//2) Surround with try/catch

//This class attempts the second option

package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SurroundWithTryCatch {

    public static void main(String[] args) {

        File file = new File("test.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println("Hello");
            //The above line will not be run if an exception is thrown in the line above
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());
        }

        System.out.println("Finished");

        //The above is known as a try/catch block
        //What the above says = Try to do this code, and if that code throws an exception, then go into the catch block
        //The catch block is therefore only executed if an exception in the try block is thrown

        //One important thing to know - if an exception is thrown in the first line of the try block (and there was
        //other code after "FileReader fr = new FileReader(file);" in the try block), that other code would not be
        //executed, and it would just go to the catch block immediately.

        //So in the below, if an exception was thrown at line "FileReader...(file);", the sout wouldn't be read, instead
        //it would just go to the catch block immediately

        //        try {
        //            FileReader fr = new FileReader(file);
        //              System.out.println("continuing");
        //        } catch (FileNotFoundException e) {
        //            e.printStackTrace();
        //        }

        //By default you get "e.printStackTrace();" in the catch block, but you can
        //actually put in anything you like in there.
        //I have changed the try / catch block above to have a sout in there. Is a bit more
        //user friendly for the person who has to then decipher the exception

        //Once the catch block has been executed, it then moves on to the next line (sequential running)
        //In this case it would go to sout("Finished")
    }
}
