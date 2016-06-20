/*

The Java platform includes a collections framework.

A collection is an object that represents a group of objects.

A collections framework is a unified architecture for representing and manipulating collections, enabling collections
to be manipulated independently of implementation details.

Package java.util - Contains the collections framework, legacy collection classes, event model, date and time
facilities, internationalization, and miscellaneous utility classes (a string tokenizer, a random-number generator, and
a bit array).

ArrayList is a class from the collections framework. It is probably the simplest and most often used class.

For more info = Look at Collection.java (which is an interface).
If you go to that class, you'll see it is implemented by many different things, for example, ArrayList.

 */

package lesson42_collections_framework_arraylists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //The Arraylist class is basically an array which is expandable - you don't need to declare the size of the
        //array when you instantiate it (like you would with a normal Array).

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //All members of the collections framework are templates.
        //This means that when you declare an e.g. ArrayList, you always have to specify the type or types of things
        //you wish to store in it.

        //I.e. there is always a <>.

        //In the above, I am declaring an ArrayList of Integers, and calling the object reference, 'numbers'.

        //Note - with template classes (<>), you cannot use primitive types. E.g. I can't do ArrayList<int>

        //If you want, when you create your ArrayList, you can specify its initial size:
        //        ArrayList<Integer> numbers = new ArrayList<Integer>(500);
        //But if you don't then John thinks that the default value is 10

        //////// Adds values to the ArrayList of Integers ////////

        numbers.add(10);
        numbers.add(100);
        numbers.add(495);

        //////// Retrieving numbers from the ArrayList ////////

        System.out.println("In the below, I am retrieving the values held within the ArrayList");
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        //Besides adding and retrieving the values in the ArrayList, you might also want to iterate through them all

        /////// Iterating through all ArrayList values using a for loop /////////

        System.out.println(
                "\nIn the below, I am iterating through the values held within the ArrayList using a for loop");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //////// Iterating through all ArrayList values using an enhanced for loop ///////

        System.out.println(
                "\nIn the below, I am iterating through the values held within the ArrayList using an enhanced for loop");
        for (Integer values : numbers) {
            System.out.println(values);
        }

        //You can also remove items from the ArrayList using the .remove() method:

        /////// Removing things from the ArrayList ///////

        //The below would remove the last value in the ArrayList:

        numbers.remove(numbers.size() - 1);

        //You can also specify the index in the ArrayList that you wish to remove:

        numbers.remove(0);

        //However, one thing to note when you remove an element that is NOT at the end of the ArrayList...
        //This can be slower than removing the element at the end of the ArrayList.

        //Why?

        //In general, when you remove an element, the ArrayList "reshuffles". If the element you've removed is at the end
        //of the ArrayList, no reshuffling needs to take place and therefore the code runs quite quickly.

        //But if you remove anything but the last element from the ArrayList (e.g. the first element (0)), some
        //reshuffling takes place. E.g. The element in 1 moves into 0, the element in 2 moves into 1 (and so on)
        //This of course takes a bit longer

        System.out.println(
                "\nIn the below, I am iterating through the values held within the ArrayList once I've removed 2 "
                        + "elements (so there is only 1 element left in it)");
        for (Integer values : numbers) {
            System.out.println(values);
        }

        //If you want to remove elements from the middle of the Arraylist (i.e. not the end), you should use the
        //LinkedList class (which we will cover in a future tutorial).

        //One last thing:

        //The collections classes are grouped by interfaces. E.g. all the list objects in the collections framework
        //(such as ArrayList) implement the List interface.

        //So this means that you can do this...

        List<String> values = new ArrayList<String>();

        //and this...

        List<String> stringValues = new LinkedList<String>();

        //etc

    }
}
