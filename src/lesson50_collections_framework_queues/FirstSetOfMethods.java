/*

This is a tutorial on queues in Java

Firstly what is a queue? Well it does what it says on the tin! It's like a queue of people in e.g. a bank

- So the o's below represent a queue of people (each o is a person).
- People enter at the end of the queue (in programming, this is called the Tail of the queue)
- People leave at the front of the queue (in programming, this is called the Head of the queue)

   (HEAD) <- ooooooooooooo <- (TAIL)

Items are added to the tail of the queue and leave at the head of the queue
Queues tend to be first in first out (FIFO) - the sooner you enter a queue, the quicker you can leave it!

Let's take a look in more detail with an example.

Java Queues:

If you look at the Java 7 API documentation...

http://docs.oracle.com/javase/7/docs/api/java/util/Queue.html

...Queue is an interface - And there is a list of 'All known implementing classes'.

In this tutorial, we will be using the ArrayBlockingQueue class - this is one of the classes that implements the Queue
interface.

Note that LinkedList also implements the Queue interface too. And in fact, a lot of the content we will cover in the
below applies to LinkedLists and the other 'known implementing classes'.

Just like in real life, a queue can have a maximum size to it, a fixed limit - and there are ways in which to deal
with e.g. trying to add an element to a queue which is already full etc - let's look at that now.

 */

package lesson50_collections_framework_queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class FirstSetOfMethods {

    public static void main(String[] args) {

        //ArrayBlockingQueues have a fixed size, which we will declare below (3):

        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        //Polymorphism at its finest above :-) (ArrayBlockingQueue and Queue)

        //There are 2 sets of methods for working with Queues (which are documented in the Java API documentation
        //online). Some throw exceptions (unchecked - i.e. runtime exceptions), others return null values.




        //////// QUEUE METHODS - ADD, REMOVE, ELEMENT (THROW UNCHECKED, AKA RUNTIME EXCEPTIONS) ///////




        //The first set of methods that allow us to interact with the queue are:


        // - add() - adds to the tail of the queue
        // - remove() - removes from the head of the queue
        // - element() - looks at the head of the queue

        //These all throw exceptions if you try to do something that doesn't make sense...




        ///////// ADD ///////////




        //So let's try to add 4 items (even though the queue has a maximum size of 3)...

        q1.add(10);
        q1.add(20);
        q1.add(30);
        //q1.add(40);

        //Before I commented out the above, when I ran this as a Java application, I got a runtime (unchecked) error:
        //"Exception in thread "main" java.lang.IllegalStateException: Queue full"

        //So let's handle that with a try / catch block (as below):

        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue");
        }

        //When I now try to run the class, my exception is caught + the above is printed to the console :-)

        //Note that I wouldn't see the above exception thrown with a LinkedList

        //(Queue<Integer> q1 = new LinkedList<Integer>();)

        //Why? Because LinkedLists are not 'bounded' - i.e. they don't have a maximum size.
        //Whereas the ArrayBlockingQueue class IS 'bounded' - i.e. they DO have a maximum size.

        //Let's now iterate through my queue:

        for(Integer value : q1) {
            System.out.println("Queue 1 value : " + value);
        }




        ///////// ELEMENT PART 1 ///////////




        //All this does is return the item currently at the head of the queue:

        System.out.println("Queue element (head of the queue) : " + q1.element());

        //But what if I try to call element when there are no elements in the queue....(go down to below REMOVE)






        ///////// REMOVE ///////////




        //Removes from the head of the queue and also returns it (for an e.g. sout)

        System.out.println("Removing from the head of the queue " + q1.remove());
        System.out.println("Removing from the head of the queue " + q1.remove());
        System.out.println("Removing from the head of the queue " + q1.remove());
//        System.out.println("Removing from the head of the queue " + q1.remove());

        //Before I commented out the above, as with adding, when I ran this as a Java application, I got a runtime
        //(unchecked) error - Why? Because the queue size is only 3 and I am trying to remove the fourth element (which
        //doesn't actually exist - hence the NoSuchElementException)

        //"Exception in thread "main" java.util.NoSuchElementException"

        //So let's handle that with a try / catch block (as below):

        try {
            System.out.println("Removing from the head of the queue " + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove item that does not exist from head of queue");
        }



        ///////// ELEMENT PART 2 ///////////




        //When I try to call an element when there are no elements in the queue, another unchecked exception is thrown
        //(at runtime)...
        //"Exception in thread "main" java.util.NoSuchElementException"
        //So let's handle that with a try / catch block too

        try {
            q1.element();
        } catch (NoSuchElementException e) {
            System.out.println("Tried to get an element when the queue is actually empty");
        }



        //So the first set of the methods when working with queues are as above - Add, Remove, Element

        //Now let's go to another class in this package, SecondSetOfMethods and view the second set of methods!
    }
}
