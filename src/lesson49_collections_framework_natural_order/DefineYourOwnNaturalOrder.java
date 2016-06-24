/*

Start with the App class and then read this class.
And once you've read this class, read the NextExample class.

This tutorial will explore how to define the natural order for your own custom objects, e.g. Person + then sort objects.

 */

package lesson49_collections_framework_natural_order;

//1) First thing's first, let's create my own custom object - 1 variable, 1 constructor and a toString method (Person)
//See below - ignore everything else for now:

import java.util.*;

class Person implements Comparable<Person> {

    //4) So I am now going to define the natural order for comparison of Person objects.
    //First thing I do is add 'implements Comparable' above.

    //Comparable is a template class and so therefore I have to state that I want to compare Person with other Person
    //objects (not always the case, sometimes you might want to compare 1 object type against another).

    //And then I have to implement the unimplemented method that I am inheriting from Comparable, the compareTo method
    //See below:

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person p1) {

        //5) The idea is that:

        //You want to return -1 if this.person is less than p1 (that you feed into the compareTo method) - i.e. sort p1
        //LATER than this.person
        //You want to return 1 if this.person is greater than p1 (that you feed into the compareTo method) - i.e. sort
        //this.person LATER than p1
        //You want to return 0 if this.person and p1 are equal

        //But before we fill in the body for the compareTo method, I will do something else.
        //As we saw in a previous tutorial, to actually add elements into a set, the hashcode and equals method for that
        //object needs to be defined - see 'collections_framework_adding_objects_to_maps_and_sets' for more detailed
        //information.

        //In a nutshell, if I want to add a custom-made object as a 'key' in a map, or as a 'value' in a
        //set, then I need to...

        //a) implement the equals and hashcode methods so that I am only adding 'unique' values to
        //the maps and sets (i.e. hashcode and equals stops duplicates from being added, and exceptions from being
        //thrown)
        //b) ensure it implements Comparable
        //c) Fill in its (the class's) compareTo method.

        //So let's complete the definition of the compareTo method now (see below).

        //7) Right so now let's implement the body (just a return method) within the compareTo method:
        //We will make the Person objects sort by alphabetical order (by the field 'name'). And the easiest way to
        //sort/compare two Strings in alphabetical order is to use the 'compareTo' method of Strings:

        return name.compareTo(p1.name);

        //8) And now that the above is implemented, I am now free to add Person objects to TreeSets (because their
        //natural order is now defined), and I can also call the Collections.sort method and pass in my list, and this
        //will also sort my Person objects in their natural order (which is alphabetical). Go to point 9.

        //FYI - If I wanted to sort by reverse alphabetical order, my return would be:
        //return -name.compareTo(p1.name);
    }

    //6) I've now added the hashcode and equals method to the Person class + this allows me to now add Person
    //objects to Sets. HOWEVER, I still cannot add them to TreeSets because I've not fully implemented the compareTo
    //method with Person - remember, the compareTo method is used to help define natural order.
    //So let's go to point 7 and do that now.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

//2) Let's now create a ArrayList and TreeSet of Person objects:

public class DefineYourOwnNaturalOrder {

    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<Person>();
        Set<Person> peopleSet = new TreeSet<Person>();

        addElements(peopleList);
        addElements(peopleSet);

        //9) So I've now added the below sort, and if I run this application, my Person objects in both the List and
        //TreeSet will now be printed to the console in alphabetical order:

        Collections.sort(peopleList);

        showElements(peopleList);
        System.out.println();
        showElements(peopleSet);

        //3) Before I define the natural order to the Person object, when I try to run addElements and then showElements,
        //an exception is thrown:

        //Exception in thread "main" java.lang.ClassCastException: collections_framework_natural_order.Person cannot
        //be cast to java.lang.Comparable

        //Basically, you cannot add an item to a TreeSet until that item's natural order is defined - remember TreeSets
        //automatically sort all items added into it into their natural order. So if the Person class does not have its
        //natural order defined (we will do that next), the TreeSet throws a hissy fit.

        //So let's fix that now - let's define the natural order for our Person class (go back to the Person class where
        //we will add 'implements Comparable' - then see my notes up there for more detail - point 4).

    }

    public static void addElements(Collection<Person> col) {
        col.add(new Person("Richard"));
        col.add(new Person("Anne"));
        col.add(new Person("John"));
        col.add(new Person("Faheem"));
        col.add(new Person("Alex"));
    }

    public static void showElements(Collection<Person> col) {
        for(Person person : col) {
            System.out.println(person);
        }
    }
}
