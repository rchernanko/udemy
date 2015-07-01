/*

In this video, we look at reading files in Java with FileReader and BufferedReader.
This is the old way of reading files.
You can also use the Scanner class to read files + there are also some other, newer features in Java 7 that will be
covered in future tutorials.
But the stuff in this package is still really useful to know because it's quite flexible in terms of the file types that
can be read.

 */

package reading_files_with_filereader;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

        try {
            FileReader fr = new FileReader(file);

            //FileReader lets you to read the file but in quite an inconvenient way.
            //If you want to read the file line by line, we actually need another class, BufferedReader

            //FileReader only lets you to read a file so many chars at a time.
            //So what we want to do is save up the chars that we read from the file and then process them one-line at a
            //time (so that we can read one-line at a time, and not only e.g. 3 chars of that line)

            //"Buffering" is when you save data up like this + then process it in useful chunks (or bytes)
            //And this is what we want to do here.
            //To do buffering here, we need to use a BufferedReader Object

            //So in the try, I must now add a BufferedReader Object that reads the FileReader (which reads the file)

            BufferedReader br = new BufferedReader(fr);

            //A String reference will point to each line in the file, in turn:

            String line;

            line = br.readLine();
            //This assigns whatever is in the first line (within test.txt), and the sout below then prints it out
            System.out.println(line);

            //When I write the above (readLine method), I have to handle another exception, "IOException", so I have
            //added this to the catch below

        } catch (FileNotFoundException e) {
            System.out.println("File not found : " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to open file : " + file.toString());
        }

        //UP TO 10.30 MINS LEFT

    }
}
