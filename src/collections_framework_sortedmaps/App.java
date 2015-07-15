/*

A reminder, maps store pairs of values - one member of the pair is called the 'key', the other 'value'

In a previous tutorial we looked at Hashmaps, and it's very important to remember that Hashmaps are not sorted in
any way. So if you iterate through the hashmap, it might give you one order. But the next time you iterate through
it, the order might be the same OR it might not be. Can randomly change......

In this tutorial, we will be looking at maps that DO maintain order.

 */

package collections_framework_sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

    //So first things first, let's create a few different types of Maps - all 3 objects we will create
    //below implement the Map interface:

    //1) A Hashmap - this does not maintain your keys and values in any particular type of order:

    Map<Integer, String> hashmap = new HashMap<Integer, String>();

    //If you want to keep your keys and values in order, there are 2 main types of Maps you can implement:

    //2) LinkedHashMap

    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

    //A LinkedHashMap has a doubly linked list connecting the entries - basically means that your values stay in the
    //same order as in which you add them to the Map.

    //3) TreeMap

    Map<Integer, String> treeMap = new TreeMap<Integer, String>();

    //A 'tree' in general computer science terms, sorts the values you add to it - sorts in its natural order
    //We will look at what 'natural order' is in future tutorials.
    //Basically, natural order is 1,2,3,4,5 etc and a,b,c,d,e etc
    //You can actually define natural order for your own classes but again, we will come onto that in a future tutorial

        System.out.println("Printing out hashmap - does not maintain order");
        testMap(hashmap);

        System.out.println("Printing out linkedhashmap - maintains order in which the key-values were added to the map");
        testMap(linkedHashMap);

        System.out.println("Printing out treemap - sorts the keys into numerical order (in this instance)");
        testMap(treeMap);
    }

    //Now I want to create a method that will clearly demonstrate the difference between the 3 maps we have used above:
    //Hashmap, LinkedHashMap and TreeMap

    //Note - all the collections in the collections classes in Java are organised under various interfaces.
    //The main 3 are Lists, Maps and Sets - we will cover Sets in a future tutorial
    //And that means that if you want to pass ANY type of map into a method as an argument, you can set the method
    //parameter as Map<>, like as below.

    //The method below will accept all 3 of our Maps above as arguments:

    public static void testMap(Map<Integer, String> map) {

        //Let's add some key-values to our map below - notice it's in a random order:

        map.put(1, "Cat");
        map.put(8, "Dog");
        map.put(23, "Swan");
        map.put(5, "Snake");
        map.put(4, "Bear");
        map.put(89, "Goat");
        map.put(3, "Sheep");
        map.put(17, "Werewolf");

        //Now let's iterate through these key-values.

        //As per the last tutorial, you can iterate through a Hashmap as per the below:

        /*

        for(Map.Entry<Integer, String> entry : map.entrySet()) {

            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " : " + value);

         */

        //But there is also another way to iterate through it

        //Iterate over all of the keys in the map and then use these to get the values:

        for(Integer key : map.keySet()){
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }

        //And now, if I call the testMap method from within my main method, and pass things my 3 maps into it,
        //you'll see that:

        //The Hashmap prints the contents of the map but in any order
        //The LinkedHashMap prints the contents of the map in the same order in which they were added
        //The TreeMap prints out the contents, sorted by Keys (Integer)



        //UP to 4 mins remaining
    }

}
