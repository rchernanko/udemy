/*

In this tutorial, we will look at how to use your own custom-made objects in sets or as keys within maps.

 */

package collections_framework_adding_objects_to_maps_and_sets;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        //First things first, let's create a map - the reason I want a LinkedHashMap is because I want to print out the
        //keys/values in the order in which they are entered:

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        //One of the properties of map keys are that they are unique - you can't have duplicate map keys:

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("One", 1);
        map.put("One", 4);

        //So when I iterate through the map keys and values as below, only 1 x "One" key is present.
        //The duplicate "One"s are not present.

        //And also notice how the value of the Map "value" is irrelevant when it comes to determining duplicates. There
        //is only "One" stored within the map. However, when I print out the below, the "One, 4" overrides the "One, 1":

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }


        //Let's do the same with sets. One of the properties of sets is that they are unique - you can't have duplicate
        //values:

        Set<String> set = new LinkedHashSet<String>();

        set.add("Dog");
        set.add("Cat");
        set.add("Parrot");
        set.add("Cat");

        System.out.println(set);

        //Remember - I don't have to iterate through the entire set (using a for loop) to print its values. I can
        //simply invoke the toString method within Sets and print out the set reference in a sout (as above).

        //When I print out the above set, there is only one Cat - no duplicate values.

        //UP TO 7 MINS 30 Secs remaining
    }
}
