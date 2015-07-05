/*

To use serialization, and prior to reading the classes within this package, it's best to re-familiarise myself with:

- how to read and write to files (using FileReader, BufferedReader etc)
AND
- how to use "try with resources"

What is serialization?

If you "take an object and serialize it" - this means turning that object into binary data
If you "deserialize an object" - this means taking binary data and turning that back into a Java object

What we are looking at in this tutorial is serializing files (writing them to files and then reading them).

We are going to take objects of the Person class and write them to a file (turning a Person object into binary data),
and then also see how we can read them back from that file (so taking binary data out of that file and then turning that
back into an object in a Java program).

To demonstrate serialization in this tutorial, we have created a Person class + 2 separate classes to read and write
objects - John stresses that in a normal program, reading and writing to files would be within the same class and that
they are simply being split in this instance for demonstrative purposes).

 */


package serialization;

//1)

//So below we have a simple class with a constructor and an overriding toString method.

//So the first thing we are going to do is take the 2 object instances we've declared in WriteObjects, and write them
//to a file. So please go to Write objects

import java.io.Serializable;

//3) This is how I make the class serializable...I add 'implements Serializable' to the Person class declaration
//Serializable doesn't actually have any methods in it...bit weird!

//So now that Person is ready to serialize, let's go back to WriteObjects and point 4, and we will now try to write the
//Person object instances (mike and sue) to the "serializable.bin" file.

public class Person implements Serializable {
    
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
