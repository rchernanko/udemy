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

        ///////// Keys in Maps are unique //////////

        //First things first, let's create a map - the reason I want a LinkedHashMap is because I want to print out the
        //keys/values in the order in which they are entered into the map - otherwise I could just use a standard
        //HashMap:

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        //One of the properties of map keys are that they are unique - you can't have duplicate map keys:

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("One", 1);
        map.put("One", 4);

        //So when I iterate through the map keys and values as below (and print), only 1 x "One" key is present.
        //The duplicate "One"s are not present.

        //And also notice how the value of the Map "value" is irrelevant when it comes to determining duplicates. There
        //is only "One" stored within the map. However, when I print out the below, the "One, 4" overrides the "One, 1":

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        ///////// Set values are also unique //////////

        //Let's do the same with sets.
        //One of the properties of sets is that they are unique - you can't have duplicate values:

        Set<String> set = new LinkedHashSet<String>();

        set.add("Dog");
        set.add("Cat");
        set.add("Parrot");
        set.add("Cat");

        System.out.println(set);

        //Remember - I don't have to iterate through the entire set (using a for loop) to print its values.

        //Why?

        //Because LinkedHashSet extends HashSet, which extends AbstractSet, which extends AbstractCollection.
        //AND in the AbstractCollection class, there is a toString method that is invoked when I try to print out a
        //reference to a LinkedHashSet (and other Sets too) - as demonstrated above

        //When I print out the above set, there is only one Cat - no duplicate values.

        /////// OK, so what if I want to add my own custom-made object to a map or set? ////////

        //To demonstrate, I will first create an object outside my App.java class (see Person class below)
        //The Person class has two instance variables, id and name, and a toString method.

        //And then I'll create four Person objects within my main method:

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");

        //FYI - Really, p2 and p4 are the same in terms of their contents. But they are pointing to different objects.

        //So next, I will create a new map that accepts Person as a parameter:

        Map<Person, Integer> personMap = new LinkedHashMap<Person, Integer>();

        personMap.put(p1, 1);
        personMap.put(p2, 2);
        personMap.put(p3, 3);
        personMap.put(p4, 1);

        for (Person key : personMap.keySet()) {
            System.out.println(key + " : " + personMap.get(key));
        }

        //And then I'll do the same with a new Set:

        Set<Person> personSet = new LinkedHashSet<Person>();

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);

        System.out.println(personSet);

        //BUT - When I print out the above map and set, the duplicate objects p2 and p4 are both included in the map
        //and set. But I thought they only store unique keys....???

        //Well, the Sets and the Maps cannot tell that p2 and p4 are the same. They do not go into the content of the
        //actual objects (by default) and validate whether the contents are the same or not.

        //But there is a way to make them look at the contents of the objects...

        //We have to give the Person class an equals and hashcode method (generate sources) - so let's do that now.

        //Ok done.

        //So now when I run the above (and sout the set and map), I will see that the duplicates have now been removed.
        //In other words, there is only p2 AND NOT p4 - There is only one Sue in my map and set.

        //Happy days

        ///////// KEY TAKE-HOME MESSAGE ///////

        //If I want to use a custom-made object as a 'key' in a map, or as a 'value' in a set, then I need to
        //implement the equals and hashcode methods in my custom-made object

    }

}

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "(ID is : " + id + " and name is : " + name + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        if (id != person.id)
            return false;
        if (name != null ? !name.equals(person.name) : person.name != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}