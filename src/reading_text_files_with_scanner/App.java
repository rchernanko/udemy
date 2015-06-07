/*

This is the simplest possible way to read a text file line by line.

 */

package reading_text_files_with_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    /*

    Before we read the contents of a text file, we need to make sure we have a text file to read!

    I have created one entitled "reading_text_files.txt" and have added it to the project folder.

     */

    public static void main(String[] args)
            throws FileNotFoundException {

        String fileName = "reading_text_files.txt";

        //However, if I were to have saved the file to my desktop, I could write the below:

        //String fileName = "/Users/b8061675/Desktop/reading_text_files.txt";

        //So the next step is to create a File object

        File textFile = new File(fileName);

        //The more traditional way of reading a file in Java involves classes like BufferedReader + FileReader

        //But a more simpler way to do it is to use the Scanner class, as below:

        Scanner in = new Scanner(textFile);

        //The above line requires me to handle an exception. For ease, I will simply throw an exception out of main

        //When you open scanner by using the above line, you should always remember to close it too (see final line)
        //This will close the file once I've finished with it

        //And now I can iterate through the text file:

        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }

        in.close();
    }





}
