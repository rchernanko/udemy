/*

Please read the Test.java class first

 */

package lesson30_exception_handling_multiple_exceptions;

public class App {

    public static void main(String[] args) {

        //I am now going to handle multiple exceptions. The main method needs to be able to handle either an IOException
        //or a ParseException (because the run2 method could throw either of these exceptions to the main method)

        Test test = new Test();

        //There are a few ways to handle multiple exceptions (when I call "test.run2();":

        //1) Use a throw declaration (add throws to the method signature) - comma separated list of exceptions
        //   FYI - I've not implemented the above in this class

        //2) Use a try catch block (see below)

        /*

        try {
            test.run2();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Print this error message");
        }

        */


        //3) Use a try multi catch - (Note to self - I couldn't see the try multi catch using the alt + enter suggestions)

        /*

        try {
            test.run2();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        */

        //Because all exceptions are subclasses of the Exception class, I could also do the below:

        /*

        try {
            test.run2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        */

        //In the above, with the help of Polymorphism, if an IOException or ParseException is thrown when calling "test.run2();", because
        //both IOException and ParseException are subclasses of Exception, the try/catch block above will catch them

        //However, there is a little complication with that though...

        //To demonstrate I have created a new method in the Test class called 'input'

        //Input throws two exceptions, IOException and FileNotFoundException.
        //FileNotFoundException is a child class of IOException

        //Because of this, in my try / catch block below, I must make sure that FileNotFoundException is above IOException (i.e.
        //it needs to be caught first). If I don't do this (and had IOException ABOVE FileNotFoundException in my try / catch block),
        //if a FileNotFoundException was actually thrown, it would be caught by the parent class IOException, and the
        //IOException messaging would be shown (and therefore not be specific to the actual FileNotFoundException thrown)

        //Therefore, you must handle the child class before the parent class in a try / catch block (because of Polymorphism)

        /*

        try {
            test.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        */

    }
}
