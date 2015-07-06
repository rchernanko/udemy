package serialization_the_transient_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) {

        System.out.println("Reading objects...");

        try (FileInputStream fi = new FileInputStream(
                "serialization_with_transient_keyword.bin"); ObjectInputStream os = new ObjectInputStream(fi)) {

            Person person = (Person) os.readObject();

            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

