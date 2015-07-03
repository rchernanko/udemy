/*

This should be read / viewed after the 'reading_files_with_try_with_resources' package
In that code, we are reading a file with BufferedReader and FileReader.
To write to a file, the code is more or less the same but we use BufferedWriter and FileWriter instead (and there is of
course no while loop to read each line of the text file).

Pretty straightforward stuff

 */

package writing_to_files_using_try_with_resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        File file = new File("WritingToFile.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {

            br.write("Hello there, this is the first line I am writing to this text file");
            br.newLine();
            br.write("And this is the second line");
            br.newLine();
            br.write("And this is the last line");

        } catch (IOException e) {
            e.printStackTrace();

            //An IOException could be thrown if the FileWriter cannot write to a file for whatever reason
        }

    }

}

