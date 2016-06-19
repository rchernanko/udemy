package lesson29_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo3 {

    //Read openFile comments first

    public static void main(String[] args) {

        try {
            openFile();
        } catch (FileNotFoundException e) {
            //PS - this message is too vague but is just for demonstrative purposes
            System.out.println("Could not open file");
        }

        //The above could also look another way (using a thrown exception and not a try / catch block):

        //  public static void main(String[] args)
        //      throws FileNotFoundException {
        //        openFile();

    }

    public static void openFile()
            throws FileNotFoundException {

        //Because of the "throws FileNotFoundException" above, any exception found in "new FileReader(file);" (below)
        //is simply thrown to the calling method "openFile()" within the main method

        //If "FileReader fr = new FileReader(file);" was surrounded by a try / catch block, the exception would be
        //dealt with there and then. But with a throw, you are just passing it onto another method, for it to deal with

        //So because I have thrown this exception to the next stack (which in this case is the main method), what I will
        //now have to do is handle the thrown exception in the main method

        File file = new File("exception_handing_test.txt");
        FileReader fr = new FileReader(file);

        //FYI - Note that at present, the above will not throw an error because there is a file named "exception_handing_test.txt"
        //actually present in my Udemy project. However, if I were to delete / rename the file, the FileNotFoundException
        //would be thrown.

    }
}




