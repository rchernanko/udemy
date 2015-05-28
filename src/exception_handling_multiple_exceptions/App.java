/*

Please read the Test.java class first

 */

package exception_handling_multiple_exceptions;

public class App {

    public static void main(String[] args) {

        //I am now going to handle multiple exceptions. The main method needs to be able to handle either an IOException
        //or a ParseException

        Test test = new Test();

        //There are a few ways to handle this:

        //1) Use a throw declaration (add throws to the method signature) - comma separated list of exceptions
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


        //3) Use a try multi catch - Only problem is that I couldn't see the try multi catch using the alt + enter suggestions

        /*

        try {
            test.run2();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        */

        //UP TO 5 mins 52 seconds left...

    }
}
