/*

Before I look at this class, I should read the class within lesson42_collections_framework_arraylists

In this tutorial, we will be comparing LinkedLists with ArrayLists.

When you create a list, you always need to think about which type you want.

The basic rule of thumb:

If you only want to ever add / remove elements from the end (or near the end) of your list, use an ArrayList (it's quicker)
But if you want to add / remove elements from the beginning or middle of your list, use a LinkedList (it's much quicker)

If you want to add items efficiently to somewhere in a list other than the beginning or end, you need a LinkedList.

 */

package lesson43_collections_framework_linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //So the first step is to simply create a new instance of ArrayList and one of LinkedList:

        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        //Note that both ArrayList and LinkedList implement the interface 'List'.
        //Therefore in the above, I can use the 'type' List<>, and simply create a new object instance of anything that
        //implements the List interface

        //For reference, note that I could also write the following (in the above):

        //ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //LinkedList<Integer> linkedList = new LinkedList<Integer>();

        //So let's say I now want to pass my lists above into a method as arguments.
        //First, I will create a doTimings method with a parameter that accepts anything that implements the List
        //interface (see the doTimings method below)

        //And now I can do this - remember that both ArrayList and LinkedList implement 'List' (an interface)

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

        //Note - in the top one, ("ArrayList", arrayList) are my arguments... (see evernote note parameter vs argument)
    }

    private static void doTimings(String listType, List<Integer> list) {

        //And now I want to see how long it takes to populate the list (and do a comparison between ArrayList and
        //LinkedList.



        /////// Time how long it takes to add items to the end of a list ///////

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        //1E5 = 1 x 10 to the exponential 5...
        //Basically gives you 100000.0 items (in double form)

        long end = System.currentTimeMillis();

        System.out.println("Time taken to add to end: " + (end - start) + "ms for " + listType);

        //The results are (if you comment out the one below):

        //Time taken: 12ms for ArrayList
        //Time taken: 12ms for LinkedList






        /////// Time how long it takes to add items somewhere else in the list ///////

        long startAgain = System.currentTimeMillis();

        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);

            //Here, I am adding an item to the beginning of the list
        }

        long endAgain = System.currentTimeMillis();

        System.out.println("Time taken to add somewhere else: " + (endAgain - startAgain) + "ms for " + listType);

        //The results are (if you comment out everything else bar the above):

        //Time taken: 857ms for ArrayList
        //Time taken: 19ms for LinkedList






        /*

        The above - Why? Why are LinkedLists quicker when adding / removing items anywhere other than at the end of
        a list?



        ARRAYLISTS are structured like this:

       [0][1][2][3][4][5].....

       So if I want to get element 30, Java can quickly locate where in memory element 30 lives.
       If I want to add an element to the end of the list, it's also pretty fast as well.

       BUT if I add an item to the beginning or middle, you then have to move all of the following items up one unit.
       You have to shift all of the items along.
       Therefore it takes quite a long time to do this. Lots of reshuffling!

       E.g. If I remove the element in 0, element 1 then moves into 0, the element in 2 moves into 1 (and so on)...



       LINKEDLISTs are structured differently to ArrayLists.
       LinkedLists consist of elements where each element has a reference to the previous and next element:

       [0] -> [1] -> [2] -> [3].....
           <-     <-     <-

       So if I want to get the item in element 30, I have to start at item [0], find its reference (which is [1], then
       find [1]s reference....etc etc, until I reach element 30. So to 'traverse' through a LinkedList takes a bit longer
       than an ArrayList

       HOWEVER, if I want to add an item to the list e.g. in between index 2 and 3 (i.e. not at the end), unlike an
       ArrayList, no 'reshuffling' takes place.
       Instead, all you have to do is make sure the references (forward and back) are pointing at the new element. And
       this is a lot quicker than reshuffling the entire list (which is what the ArrayList does).




        ////// So to conclude //////

        Use an ArrayList if you are going to add / remove items to the end (or nearly the end) of a list
        Use a LinkedList if you are going to add / remove items to the beginning or middle of the list






        In Udemy notes, John mentions the following:

        IMPORTANT NOTE: I had misunderstood something when making this video, as pointed out to me by "kidbabic" on
        YouTube among others. If you add or insert something to a LinkedList by specifying an index, the list has to
        iterate over all items in itself up to that point in order to find the insertion/deletion point. So adding or
        removing to LinkedList is only faster if you use an iterator, which you have ready pointing at the correct
        point. See the tutorial on iterators later on for more info


        */

    }
}
