/*

Maps let you store key-value pairs, so that for example you can retrieve objects via an ID. HashMap is the most
lightweight in terms of memory, and the one you'll use the most often.

After lists, maps are probably the next most useful of the Java collection classes

 */

package collections_framework_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        //Maps store pairs of values.
        //One member of the pair is called the 'key', the other 'value'

        //When you create a map instance, you have to specify which kinds of objects you want to store in it.
        //You can specify any type of object for your keys and values - it could be an object you have created within
        //your project / framework

        //Only thing to bear in mind is that if you store a custom-made object as the 'keys' in a map, you have to
        //implement the hashcode and equals method. But let's put that aside for now.

        //So, first thing, lets create a new Hashmap instance that stores Integers as 'keys' and Strings as 'values'.

        //Again, all classes in the collections framework (e.g. maps, lists etc) are template classes that require you
        //to specify which types of objects you will be working with (within the <> brackets)

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //We can add 'key-value' pairs into this map by using the method 'put':

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(13, "Thirteen");

        //The above is basically going to create a lookup table where you can lookup the String 'values'
        //with Integer 'keys'

        //////// So how do I get 'values' in the Hashmap (aka lookup table)? ////////

        //I use the maps 'get' method and find the 'value' by its 'key':

        String text = map.get(3);

        System.out.println(text);

        //If I try to get a key/value that doesn't exist, this returns null:

        System.out.println(map.get(6));

        //And what happens if you add a duplicate key?

        map.put(5, "New Five");

        String text2 = map.get(5);

        System.out.println(text2);

        //As you'll see from the console, the latest key-value, 5 ("New Five"), is printed. So the latest key-value
        //pair has overriden the initial one.

        //////// Iterating through key-value pairs ////////

        //Slightly strange syntax:

        for(Map.Entry<Integer, String> entry : map.entrySet()) {

            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " : " + value);

        }

        //One thing to REALLY BEAR IN MIND!!!!

        //Hashmaps are not sorted in any way.
        //So if you iterate through the hashmap, as we have above, it might give you one order. But the next time you
        //iterate through it, the order might be the same OR it might not be. Can randomly change......

        //So, it's key to note that "A Hashmap does not maintain order"

        //We'll look at maps that do maintain order in future tutorials

    }
}
