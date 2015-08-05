/*

Start with this class and then go to DefineYourOwnNaturalOrder class (for part 2), and then class NextExample (for part
3)

In this tutorial, we're going to look at natural order in the context of sorting arrays and sorting TreeSets - note
that the theory we will discuss also applies to sorting the key values of TreeMaps into natural order, but we won't be
looking at this specifically in this tutorial.

And we will also look at how you define the natural order for your own classes (see DefineYourOwnNaturalOrder)

 */

package collections_framework_natural_order;

import java.util.*;

public class App {

    public static void main(String[] args) {

        //First thing's first - I will create an ArrayList of Strings, add some Strings to the list, and then sort them
        //into their natural order.

        //For Strings, natural order = alphabetical order
        //For Integers, natural order = numerical order

        //And while I'm here, I'll add the same String values to a TreeSet - a reminder, TreeSets automatically sort
        //things that have been added into them, in their natural order:

        List<String> list = new ArrayList<String>();
        Set<String> set = new TreeSet<String>();
        //Note - I could also say SortedSet<String> set = new TreeSet<String>
        //SortedSet extends 'Set' and is an interface

        //Rather than adding the Strings twice (separately) to my ArrayList and TreeSet, I will simply call the
        //'addElements' method and pass in both my List and Set (see below, out of this class).
        //And I'll also create another static method to iterate through the values in my List / Set and print them
        //to the console - 'showElements':

        addElements(list);
        addElements(set);

        //And because the elements in my list already have their natural order defined (which Strings do), I can use the
        //Collections.sort method as below:

        Collections.sort(list);
        //FYI - I don't need to do a sort on my TreeSet because it does it automatically anyway.

        System.out.println("Show elements on my list: ");
        showElements(list);
        System.out.println();

        System.out.println("Show elements on my set: ");
        showElements(set);

        //GREAT! My list and set is now sorted into natural order.

        //But what if I want to sort a list of my own custom objects e.g. Person, into natural order??? How do I do this?
        //See the DefineYourOwnNaturalOrder class within this package to find out more...
    }

    //Because both List and Set extend the Collection class, I can use it here (and pass in my List and Set).
    //Polymorphism in full flow:
    public static void addElements(Collection<String> col) {
        col.add("Richard");
        col.add("Sue");
        col.add("Mike");
        col.add("John");
        col.add("Anne");
    }

    public static void showElements(Collection<String> col) {
        for (String element : col) {
            System.out.println(element);
        }
    }
}
