/*

In this video, we look at reading files in Java with FileReader and BufferedReader.
This is the old way of reading files.
You can also use the Scanner class to read files + there are also some other, newer features in Java 7 that will be
covered in future tutorials (see the 'reading_files_with_try_resources' package)
But the stuff in this package is still really useful to know because it's quite flexible in terms of the file types that
can be read.

 */

package lesson33_reading_files_with_filereader;

import java.io.*;

public class App {

    public static void main(String[] args) {

        //First thing is to create a text file (test.txt) and add some words to it (for us to read). I'll do that now.

        //I'll create a File Object can that read that file.
        //A File Object is a platform-independent way of representing a file

        File file = new File("test.txt");

        //I also need to create a FileReader object to actually read the file.
        //I'll also have to handle an exception that FileReader throws, "FileNotFoundException" - I'll do this using
        //a try/catch block

        //So basically, the FileReader tries to read the file, and if it can't (for whatever reason), it throws a
        //FileNotFoundException which we catch below. If caught, the rest of the code within this class it then executed

        ////////   BufferedReader   ////////

        //FileReader lets you to read the file but in quite an inconvenient way.
        //If you want to read the file line by line, we actually need another class, BufferedReader

        //FileReader only lets you to read a file so many chars at a time.
        //So what we want to do is save up the chars that we read from the file and then process them one-line at a
        //time (so that we can read one-line at a time, and not only e.g. 3 chars of that line)

        //"Buffering" is when you save data up like this + then process it in useful chunks (or bytes)
        //And this is what we want to do here.

        //To do buffering here, we need to have a BufferedReader Object

        //Once one opens a BufferedReader, it will eventually need to be closed as otherwise this can cause memory leaks
        //If I create a new BufferedReader object within the try/catch
        //loop below (i.e. if I write BufferedReader br = new BufferedReader(file) after the
        //line "FileReader fr = new FileReader(file);"), I can only close br inside the first
        //try/catch (i.e. it's scope is within the first try/catch).
        //And if I did this + and a FileNotFoundException was thrown, the BufferedReader would never be closed.
        //And that would be bad!!! :-(

        //Therefore I am declaring a BufferedReader reference outside the try/catch loop (see below) so that I can then
        //close it outside the initial try/catch loop.
        //Therefore, if a FileNotFoundException is ever thrown, the BufferedReader object is still closed = which
        //is good!!!

        //Is pretty complex to try and cover over words, so if I am confused by the comments in this class, it's worth
        //re-watching the video.

        BufferedReader br = null;

        //And the reason that it is initialised to 'null' is because when I use br.close() below, it won't compile
        //unless br is pointing to something.
        //e.g.
        //If a FileNotFoundException is thrown (and i do not assign null to br), br
        //would have nothing to close, and an error would be present (in fact, i can't compile my code...).

        try {
            FileReader fr = new FileReader(file);

            br = new BufferedReader(fr);

            //A String reference will point to each line in the file, in turn:

            String line;

            while((line = br.readLine()) != null) {

            /*

            Initial code prior to adding the while loop:

            line = br.readLine();

            //This assigns whatever is in the first line (within test.txt), and the sout below then prints it out

             */

                System.out.println(line);
            }

            //When I write the above (readLine method), I have to handle another exception, "IOException", so I have
            //added this to the catch below

        } catch (FileNotFoundException e) {
            System.out.println("File not found : " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to open file : " + file.toString());
        }

        //So if you look at the 'initial code' section, you'll see that originally we were only actually reading the
        //first line of test.txt "line = br.readLine();"
        //But we actually wanted to read all the contents of the test.txt file, not just the first line
        //So I've added a while loop that stops when line is equal to null


        //Once a BufferedReader is opened, I need to ensure that it is closed so that there are no memory leaks etc
        //And I've had to wrap it in a try/catch block to handle an unhandled exception (see below).

        //If br is not set to 'null' (see notes above), the try below would try and close br without it ever
        //being initialised - this code will not compile.
        //And we must also add a NullPointerException to the catch block below because if FileNotFoundException is
        //thrown, br.close will throw a NullPointerException (because it is pointed to Null!)

        finally {

        try {
            br.close();
        } catch (IOException e) {
            System.out.println("Unable to close file : " + file.toString());
        } catch (NullPointerException e) {
            System.out.println("File was never opened : " + file.toString());
        }

        }

        //what is the "finally"?
        //In this particular App we are actually catching exceptions (using try/catch blocks) + then
        //execution simply continues once the exception is caught.
        //However, realistically this code would probably not be written in the main method + you would want to throw
        //the exception further up the stack (you might not necessarily use a try/catch block, you might just throw the
        //exception in the method signature).

        //Normally when this happens, when exceptions are thrown, the execution simply stops.
        //However, if you use the 'finally' keyword, whatever is within finally will always, always be executed.
        //So even if FileNotFoundException was thrown (and we weren't using a try/catch block), whatever is in 'finally'
        //would still be run


        //So the above is incredibly ugly! The exceptions have built up and have cluttered my code
        //There is a nicer, simpler way to do this in Java 7, which will be covered in the next tutorial :-)
        //See the 'reading_files_with_try_resources' package

        //There are a lot of comments in this class, so I have taken away the comments + just put the code in a duplicate
        //class within this package, called AppCodeOnly
    }
}
