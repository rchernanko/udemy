/*

Iterators (an interface) are the thing that enable you to get each element in a collection in sequence.
We'll look at using them in this tutorial, then next time we'll move on to implementing our own (Iterable).

 */

package collections_framework_iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {



        ///////// MODERN ITERATION - JAVA 5 AND LATER /////////



        //Let's first create a LinkedList of Strings:

        LinkedList<String> animals = new LinkedList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("rabbit");
        animals.add("fox");
        animals.add("lion");

        //A standard way to iterate through a list is to use a for-each loop (Java 5 and later):

        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        //Before Java 5, the 'for-each' syntax / construct did not exist.
        //Therefore, the way to iterate through an, e.g., list was to use an Iterator.
        //But Iterators definitely still have their good uses now (in the Java 8 days)!




        ///////// BEFORE JAVA 5 - ITERATION  - BUT STILL ALSO VERY USEFUL TODAY TOO!!! /////////




        LinkedList<String> names = new LinkedList<String>();

        names.add("richard");
        names.add("sam");
        names.add("joel");
        names.add("peter");
        names.add("darren");
        names.add("scott");

        //So the way to iterate through a e.g. list was to use an Iterator, like below:

        Iterator<String> iterator = names.iterator();

        //The above 'names.iterator' returns an object of the type Iterator

        //The reason I can use an Iterator on a LinkedList is because Lists, and in fact a lot of Collections in
        //general, implement the Iterable interface.

        //The Iterable interface has only 1 method, iterator(), which returns an Iterator

        //And Iterator has 3 methods - hasNext, next, remove.

        //For more info, see here = http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html

        //An Iterator can point to each item in the list, in turn, using the next() method, as below...




        /*

        Commenting out the below because it gets in the way of the other stuff below it!:

        String name = iterator.next();
        System.out.println(name);

        //The next() method prints out the first item in my list (in this case "richard") and then moves the Iterator
        //onto the next item in the list

        //So the below will print out "sam", the next item in my LinkedList...

        String name2 = iterator.next();
        System.out.println(name2);

         */

        //The way you'd normally use Iterator is in a loop using the hasNext() method...
        //And an advantage of using Iterator over a for-each loop is that you can use iterator to remove items:

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);

            if(value.equals("sam")) {
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println("Once I've removed 'sam' : ");
        System.out.println();

        //Once I've removed 'sam', if I iterate through the LinkedList again (see below), "sam" has been removed:

        for (String value2 : names) {
            System.out.println(value2);
        }

        //I CAN'T REMOVE ITEMS USING A FOR-EACH LOOP

        //IF I WANT TO REMOVE ITEMS IN A LIST WHILST ITERATING THROUGH IT, I MUST USE THE ITERATOR (NOT A FOR-EACH LOOP)

        //Note that for-each actually uses Iterators behind the scenes...we will look at this in more detail in the
        //tutorial on Iterables...

        //John also mentioned that if you want to add to your list whilst iterating through it, you should use the
        //ListIterator class

        //Note that the reason we are using a LinkedList above is because it is more efficient to remove items (that
        //are not at the end of the list) using a LinkedList as opposed to an ArrayList (see my notes in other classes)

    }

}



/*

From the Java API documentation:

https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html

Iterators

An Iterator is an object that enables you to traverse through a collection and to remove elements from the collection
selectively, if desired. You get an Iterator for a collection by calling its iterator method. The following is the
Iterator interface:

public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove(); //optional
}

The hasNext method returns true if the iteration has more elements, and the next method returns the next element in
the iteration. The remove method removes the last element that was returned by next from the underlying Collection.

The remove method may be called only once per call to next and throws an exception if this rule is violated.

Note that Iterator.remove is the only safe way to modify a collection during iteration; the behavior is unspecified if
the underlying collection is modified in any other way while the iteration is in progress.

Use Iterator instead of the for-each construct when you need to:

- Remove the current element. The for-each construct hides the iterator, so you cannot call remove. Therefore, the
for-each construct is not usable for filtering.
- Iterate over multiple collections in parallel.

and so on...there is lots more on the Java website above.

 */