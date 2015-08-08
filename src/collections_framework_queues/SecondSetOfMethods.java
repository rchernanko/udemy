package collections_framework_queues;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class SecondSetOfMethods {

    //There are 2 sets of methods for working with Queues (which are documented in the Java API documentation
    //online). Some throw exceptions (unchecked - i.e. runtime exceptions), others return null values.

    //We've already looked at the first set of methods (Add, Remove, Element) - now let's look at the second set.
    //The second set of the methods below DO NOT THROW EXCEPTIONS!!!

    // - Offer() - adds item to queue if there is space. If there is no space in the queue, it doesn't add the item
    // - Poll() - removes item from the queue IF there is an item to be removed. If not, it simply returns null.
    // - Peek() - gets the item at the head of the queue and returns it. If no items in the queue, 'null' is returned


    public static void main(String[] args) {




        ///////// OFFER ///////////




        //Like 'add' but doesn't throw an unchecked exception:


        Queue<String> q2 = new ArrayBlockingQueue<String>(3);

        q2.offer("Richard");
        q2.offer("Lee");
        q2.offer("Jo");

        //Now let me try to add a fourth item to a queue which has a maximum size of 4...

        q2.offer("Lucy");

        //And now let's iterate through my q2 to see what has been added to it:

        for(String value : q2) {
            System.out.println("Queue 2 value : " + value);
        }

        //When I run the above, there is no "Lucy" printed. In other words, Lucy has not been added to my queue AND NO
        //EXCEPTION IS THROWN AT RUNTIME :-)

        //Basically, "offer" returns false if it cannot add the item... e.g. the below will be printed out...

        if (!q2.offer("Anne")) {
            System.out.println("Offer failed to add Anne to queue 2");
        }




        ///////// PEEK PART 1 ///////////




        //It's like 'element' in that it returns the item currently at the head of the queue.

        System.out.println("Queue 2 peaking : " + q2.peek());

        //But, 'peek' differs to 'element' in that it doesn't throw any unchecked exceptions if there are no items at
        //the head of the queue - see below 'Poll' to see this in action...






        ///////// POLL ///////////




        //It's like 'remove', the difference being that 'Poll' doesn't throw an unchecked exception:

        System.out.println("Queue 2 poll : " + q2.poll());
        System.out.println("Queue 2 poll : " + q2.poll());
        System.out.println("Queue 2 poll : " + q2.poll());
        System.out.println("Queue 2 poll : " + q2.poll());

        //There are only 3 items in my queue so when i try to poll for a fourth time (i.e. remove the fourth item),
        //'null' is returned.
        //No exceptions are thrown at runtime.





        ///////// PEEK PART 2 ///////////



        System.out.println("Trying to peek when there are no elements in the queue : " + q2.peek());





        /////// BLOCKING QUEUES (GOOD KNOWLEDGE TO HAVE FOR MULTI-THREADING) /////////




        //The interface Queue has a sub-interface called BlockingQueue.

        //BlockingQueue has another 2 sets of methods which can be used with queues - e.g. put and take:

        // - Put() = Basically if you try to 'put()' an item into a queue that is already full, your program thread is
        //suspended until there is space in the queue for the item to be added.

        // - Take() = Similarly, it you try to 'take()' an item from an empty queue (equivalent of removing or polling),
        //your program thread is suspended until there is something in the queue that can be taken.

        //The above is fairly advanced but is very useful to have knowledge of this stuff when you use multi-threading
        //Multi-threading = having multiple threads of code running at the same time.

        //Queues are very very useful in multi-threading...one for my more advanced Java knowledge I think....




    }
}
