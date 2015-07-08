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

            //6)
            //In the method below, I am setting the static variable 'count' to 88
            //Within the Person class, I've also updated the toString method so that it prints out the value in 'count'

            Person.setCount(88);

            os.writeObject(person);

            //7)
            //So now let's see what happens when we try to serialize and deserialize the Person object instance,
            //which, remember, now has a static variable.

            /*

            When we run the main method within WriteObjects and then ReadObjects, the following is printed to the
            console:

            Reading objects...
            Person{id=0, name='richard, count='0'}

            So you can see that now id AND count is 0 (i.e. count has been given the default int value of 0)

            So despite the fact that we set the count to 88 prior to 'os.writeObject', the value 88 is not serialized.

            When it comes to serialization, static fields/variables (and their values) are never serialized.

            And again, when you think about it, it wouldn't make sense to serialize the static fields.

            Why?

            Because the field and its value belongs to the class, not individual objects. So if you saved 'count' to
            file, you'd just be saving the same value over and over again.

             */


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*

8)

John also discussed the serialVersionUid field / variable, but I am not going to be documenting this.
For more information, just watch the video again.

He also discussed the use of constructors and serialization. Basically when you serialize a Person object, a Person
constructor is called. However when you deserialize the object from the .bin file, the constructor is not called again,
it just deserializes what has already been written to the .bin file (makes sense when you think about it).

When you deserialize (i.e. ReadObjects), you are simply restoring the fields that were initialised when you created the
Person object (in WriteObjects) using its constructor. So you don't run a constructor when you deserialize objects.

Just something to be aware of...

Great line re: constructors = Every time you create an object, a constructor of some sort is run. You have to run some
constructor to create an object.

 */