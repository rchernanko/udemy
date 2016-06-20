package lesson40_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) {

        System.out.println("Reading objects...");

        //5) So now let's write some code that can deserialize the binary data that is now within the serialization.bin
        //file (i.e. let's write code that allows us to read this binary data from within serialization.bin and turn
        //it back into a Java object)

        //Rather than using FileOutputStream, let's use FileInputStream.
        //And rather than using ObjectOutputStream, let's use ObjectInputStream:

        try (FileInputStream fi = new FileInputStream("serialization.bin"); ObjectInputStream os = new ObjectInputStream(fi)) {

            //So both of the above objects FileInputStream and ObjectInputStream are declared within the try with
            //resources block. And because of this, FileInputStream and ObjectInputStream are automatically closed :-)

            //Now I can read from my file.

            //I know that I wrote 2 person objects to serialization.bin, so I am going to read 2 person objects 1 after
            //the other

            Person person1 = (Person) os.readObject();

            //As you can see, I have to cast os.readObject() to a Person because os.readObject() on its own, simply
            //returns an "Object" (the super class of all objects). Casting it to a Person object transforms the super
            //Object into the actual particular type of object that I want - i.e. a Person object

            //os.readObject also throws an exception, ClassNotFoundException - I have added this to my catch clauses
            //below.

            //What is a ClassNotFoundException? Well, readObject might read an object of a class that doesn't actually
            //exist in this program. In this instance, we have a Person class within this program, and so we are ok -
            //the exception will not be thrown/caught.

            //Now let's read the second Person object that we wrote:

            Person person2 = (Person) os.readObject();

            //And just to demonstrate that we have read correctly, let's do the souts below...

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //John also spoke about serialVersionUID, but I will not be documenting this within this tutorial.
    }
}

/*

6) So why am I using FileOutputStream / FileInputStream instead of FileWriter / FileReader?

What's the difference? When should I use one or the other?

From an evernote note I've saved:

"

When we use Java to write something to a file, we can do it in the following two ways.
One uses FileOutputStream, the other uses FileWriter.

There are a lot of discussion on each of those classes, they both are good implements of file i/o concept that can be
found in a general operating systems. However, we don't care how it is designed, but only how to pick one of them and
why pick it that way.

From Java API Specification:

FileOutputStream is meant for writing streams of raw bytes such as image data. For writing streams of characters,
consider using FileWriter.

"

*/
