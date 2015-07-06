package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {

        System.out.println("Writing objects...");

        Person mike = new Person(234, "Mike");
        Person sue = new Person(749, "Sue");

        System.out.println(mike);
        System.out.println(sue);

        //2)

        //So the first thing we are going to do is take the 2 object instances we've declared above, and write them
        //to a file. To do that, we will use the class FileOutputStream...

        //FileOutputStream allows us to stream data to a file (streaming = sending data to a file sequentially).
        //I have to pass the file name (even if it doesn't yet exist) to the FileOutputStream constructor :
        //("serialization.bin") - a file that can handle binary data basically

        //I also have to handle a 'FileNotFoundException' exception that FileOutputStream throws

        //And I'll do all of this using "try with resources" - this means that I don't have to then close
        //fs (FileOutputStrem) because the try-with-resources does this automatically for me :-)

        try (FileOutputStream fs = new FileOutputStream("serialization.bin"); ObjectOutputStream os = new ObjectOutputStream(fs)) {

            //I've also added an ObjectOutputStream within the try with resources block, and am passing the fs
            //reference to its constructor...

            //So both of the above objects FileOutputStream and ObjectOutputStream are declared within the try with
            //resources block. And because of this, FileInputStream and ObjectInputStream are automatically closed :-)

            //And now, I want to write my Person object instances to my serialization.bin file:

            os.writeObject(mike);
            os.writeObject(sue);

            //So everything is good now yeah? NO!

            //If I run the above, a "java.io.NotSerializableException: serialization.Person" exception is thrown

            //Why? (This is a classic exam/interview question!)

            //How do I make the Person class serializable? i.e. I want to make it possible to serialize the Person class

            //It's quite simple really - head to point 3 within the Person class to see how...

            //4)

            //So now that we have made Person implement Serializable, when we run this main method again, we should
            //no longer see any exception thrown

            //And actually, I've now also created a "serialization.bin" file in my project folder - have a look!
            //So we have now serialized these two Person object instances. Java objects have now been turned into
            //binary data and written to the serialization.bin file :-)

            //So now let's write some code that can deserialize this binary data (i.e. let's write code that allows us
            //to read this binary data from within serialization.bin and turn it back into a Java object)
            //Go to point 5 within ReadObjects

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //The above will be caught if we cannot create the serialization.bin file
        } catch (IOException e) {
            e.printStackTrace();
            //the above will be caught if we cannot write to the serialization.bin file
        }

    }
}
