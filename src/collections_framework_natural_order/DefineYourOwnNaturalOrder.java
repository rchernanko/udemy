/*

Start with the App class and then read this class.

This tutorial will explore how to define the natural order for your own custom objects, e.g. Person + then sort objects.

 */

package collections_framework_natural_order;

//1) First thing's first, let's create my own custom object - 1 variable, 1 constructor and a toString method:

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

        //The idea is that:

        //You want to return -1 if this.person is less than p1 (that you feed into the compareTo method)
        //You want to return 1 if this.person is greater than p1 (that you feed into the compareTo method)
        //You want to return 0 if this.person and p1 are equal




        //UP TO 10 MINS REMAINING



        return 0;
    }
}

//2) Let's now create a ArrayList and TreeSet of Person objects:

public class DefineYourOwnNaturalOrder {

    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<Person>();
        Set<Person> peopleSet = new TreeSet<Person>();

        addElements(peopleList);
        addElements(peopleSet);

        showElements(peopleList);
        showElements(peopleSet);

        //3) Before I add ANY natural order to the Person object, when I try to run addElements and then sortElements,
        //an exception is thrown:

        //Exception in thread "main" java.lang.ClassCastException: collections_framework_natural_order.Person cannot
        //be cast to java.lang.Comparable

        //Basically, you cannot add an item to a TreeSet until that item's natural order is defined - remember TreeSets
        //automatically sort all items added into it into their natural order. So if the Person class does not have its
        //natural order defined (we will do that next), the TreeSet throws a hissy fit.

        //So let's fix that now - let's define the natural order for our Person class (go back to the Person class where
        //we will add 'implements Comparable' - then see my notes up there for more detail.

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
