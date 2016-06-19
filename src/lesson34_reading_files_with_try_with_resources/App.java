/*

This package / class should be read / viewed after the classes within 'reading_files_with_filereader'

In the 'reading_files_with_filereader' class, there is a giant blob of code within the try / catch blocks, and
it's really tricky to read, and doesn't look that nice.

"Try with resources" is a feature that was introduced with Java 7. It aims to simplify the code within the
'reading_files_with_filereader' class

 */

package lesson34_reading_files_with_try_with_resources;

import java.io.*;

public class App {

    public static void main(String[] args) {

        //The first things to know if that BufferedReader implements AutoClosable (via a few other things + inheritance)
        //Any class that implements AutoClosable must have a close method + BufferedReader does indeed have one

        //When using the Java 7-introduced "try with resources" feature, the close method on BufferedReader is
        //automatically called, and we do not need to write br.close (as we did in the reading files within the
        //'lesson33_reading_files_with_filereader' package classes).

        //So any class that implements Autoclosable (and therefore has a close method), will automatically execute that
        //close method at the end of the "try with resources"

        //The "try with resources" structure is as per the below:

        File file = new File("trywithresources.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            //This is what will be thrown if FileReader cannot find the file we are passing into it
            System.out.println("Can't find the file : " + file.toString());
        } catch (IOException e) {
            //This is what will be thrown either if BufferedReader cannot close the file, OR, if BufferedReader cannot
            //read the file (br.readLine), if it is corrupted for example. I'm going to print an error message for
            //the latter
            System.out.println("Unable to read file : " + file.toString());
        }

        //So if you compare this code above to the blob of code in the 'lesson33_reading_files_with_filereader' class, you will
        //see that this is much more readable + easier to maintain and understand :-)

        //I've also created another class in this package called Temp to illustrate that the close method will be
        //called automatically on ANY class that implements AutoClosable


        /*

Initial question I had about the closing the BufferedReader...

Q)

try.with resources - what about the br.close()? where should this go? or does the bufferedreader close
automatically (because BufferedReader implements autoclosable?). check the comments + perhaps email him on udemy...?

A) From John Purcell himself on the udemy comments:

If you create an object within a try(), close() will be called automatically. This is only true if you create it within
the round brackets immediately following try(); not true if you create it in the curly brackets where most of the code
goes. However you do it, if you close BufferedReader or whatever class encloses the others, the close method will be automatically closed on the other objects.

E.g. if you do

try(BufferedReader br = new BufferedReader(new FileReader("something.txt"))) {

...

}

The "try" here will automatically call br.close() at the closing curly bracket, and this will automatically close
the FileReader as well.

 */
    }
}
