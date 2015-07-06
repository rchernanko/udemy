package serialization_the_transient_keyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {

        System.out.println("Writing objects...");

        try (FileOutputStream fs = new FileOutputStream(
                "serialization_with_transient_keyword.bin"); ObjectOutputStream os = new ObjectOutputStream(fs)) {

            //The above is a bit mental! Quite long. It can be cut down to the following but whether you do this or
            //not, it's simply a matter of preference:

            //try (ObjectOutputStream os = new ObjectOutputStream(
            //new FileOutputStream("serialization_with_transient_keyword.bin"))) {}

            Person person = new Person(7, "richard");
            os.writeObject(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
