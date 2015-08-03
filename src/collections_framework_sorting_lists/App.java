/*

This tutorial looks at how to sort lists using Comparators.

 */

package collections_framework_sorting_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    //First thing's first - let's create a list of Strings with some values added into it.
    //I am using an ArrayList in the example below, but the technique to sort also applies to other types of Lists

    public static void main(String[] args) {




        //////////// SORTING A LIST OF STRINGS INTO NATURAL ORDER /////////////




        List<String> animals = new ArrayList<String>();

        animals.add("snake");
        animals.add("cat");
        animals.add("elephant");
        animals.add("rabbit");
        animals.add("mongoose");

        //If I want to sort this list into its natural order (which with strings is alphabetical), I can use a static
        //method of the Collections class called 'sort'

        Collections.sort(animals);

        System.out.println("Sorting list of Strings into natural order: ");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        //So when I do the above sout, the animals in my list are printed in alphabetical order :)




        //////////// SORTING A LIST OF INTEGERS INTO NATURAL ORDER /////////////





        //And the same also applies with a List of Integers or Doubles (and I guess Floats) - I can also use the static
        //sort method to order the Integers into their natural order (which is numerical order):

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(28);
        numbers.add(85);
        numbers.add(14);
        numbers.add(18);
        numbers.add(5);
        numbers.add(293);

        Collections.sort(numbers);

        System.out.println("Sorting list of Integers into natural order: ");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        //When I print out the above, the Integers are sorted into their 'natural order' (as is the List of Strings).
        //Note that we will be looking at natural order in a bit more detail in the next tutorial.




        //////////// SORTING A LIST OF STRINGS / INTEGERS INTO SOMETHING OTHER THAN ITS NATURAL ORDER /////////////





        //BUT....

        //What if I want to sort my list in something other than natural order...?

        //To do this, I need to create a class that implements the comparator interface.





        //////////// SORTING A LIST OF STRINGS INTO ORDER OF STRING LENGTH /////////////





        //So let's say I want to create a comparator that sorts my list of football teams in order of string length...
        //Have a look at the StringLengthComparator class I have created at the bottom of this one.

        //Right, StringLengthComparator now created. Let's create a list of football clubs

        List<String> footballClubs = new ArrayList<String>();

        footballClubs.add("Tottenham Hotspur");
        footballClubs.add("Arsenal");
        footballClubs.add("Manchester United");
        footballClubs.add("Chelsea");
        footballClubs.add("West Ham United");

        //In order to sort via string length, I now need to instantiate a new StringLengthComparator object in my
        //Collections.sort method (as below):

        Collections.sort(footballClubs, new StringLengthComparator());

        //So the list should now be sorted in length of string. So let's see that in a sout!

        System.out.println("Sorting a list of Strings into order as per their string length (using Comparator):");
        for (String footballClub : footballClubs) {
            System.out.println(footballClub);
        }
        System.out.println();





        //////////// SORTING A LIST OF STRINGS INTO REVERSE ALPHABETICAL ORDER /////////////





        //AND what about if i want to sort a list into reverse alphabetical order...?
        //Ok let's start by using a Comparator to sort into alphabetical order (and then we can work on reverse).

        //So have a look at my AlphabeticalOrderComparator class below (outside this class)...and then look at the
        //below:

        Collections.sort(footballClubs, new AlphabeticalOrderComparator());

        System.out.println("Sorting a list of Strings into alphabetical order (using Comparator):");
        for (String footballClub : footballClubs) {
            System.out.println(footballClub);
        }
        System.out.println();

        //And how to make it sort into reverse alphabetical order?
        //To demonstrate, I will create a ReverseAlphabeticalComparator class outside this current class (see below)

        //And then I will call it below:

        Collections.sort(footballClubs, new ReverseAlphabeticalComparator());

        System.out.println("Sorting a list of Strings into reverse alphabetical order (using Comparator):");
        for (String footballClub : footballClubs) {
            System.out.println(footballClub);
        }
        System.out.println();





        ///////// SORTING LIST OF INTEGERS USING ANONYMOUS CLASSES //////////





        List<Integer> angles = new ArrayList<Integer>();

        angles.add(28);
        angles.add(85);
        angles.add(14);
        angles.add(18);
        angles.add(5);
        angles.add(293);

        //And below, I am using an anonymous class to sort my list of integers into an order I want.
        //Again, I am using the compareTo method of the Comparable interface:

        Collections.sort(angles, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
                //return 1 if num1 should come later in the list than num2 (i.e. it has higher numerical value)
                //Of course, if I wanted to sort the Integers into reverse order I can write:
                //'return -num1.compareTo(num2)'
            }
        });

        System.out.println("Sorting a list of Integers using an anonymous Comparator interface: ");
        for (Integer angle : angles) {
            System.out.println(angle);
        }
        System.out.println();




        ///////// SORTING ARBITRARY OBJECTS //////////





        //First thing to do - I will create a Person class below. This will have some instance variables, a constructor,
        //getters and setters, and a toString method (so that we can check the order in which we are sorting Person
        //objects is correct - we will be sorting by the name variable):

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(2, "Richard"));
        people.add(new Person(1, "Matilda"));
        people.add(new Person(34, "Stuart"));
        people.add(new Person(32, "Alice"));

        //Before we sort them, let's just check that the order in which these will be sorted is as per the order
        //in which I've added them to the people list - of course when I try to print out a Person object, I will be
        //invoking the toString method in Person:

        System.out.println("Printing out a list of Person objects before they are sorted: ");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        //And now I want to sort my Person objects into order as per their id:

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                if (p1.getId() > p2.getId()) {
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("Printing out a list of Person objects after they've been sorted in order of their ID : ");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        //And I could also sort my Person objects into order as per their name (using compareTo method, which is
        //implemented by both Integer and String, and is a method within the Comparable interface).
        //NOTE - I don't think I can use the compareTo method on primitive 'ints' - hence why I can't use it when
        //sorting by Person ids:

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("Printing out a list of Person objects after they've been sorted in order of their name : ");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

    }

}

//Comparator is a template type so I have to specify the type of objects I plan to compare (in the <>)
//And I also have to implement the Comparator Interface's compare method

class StringLengthComparator implements Comparator<String> {

    //In our case, the compare method is going to be passed two Strings (from our list) at a time.
    //And it's then going to analyse which one is greater than the other

    //If s1 is equal to s2 - return 0
    //If s1 is greater than s2 (if the first argument should sort later in the list VS s2) - return 1
    //If s2 is less than s1 (if the first argument should sort earlier in the list VS s2) - return -1

    //So let's get the length of these strings...

    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return 1;
        }
        //i.e. if len1 is greater than len2, return 1 (which will make it sort later in the list)

        else if (len1 < len2) {
            return -1;
        }

        return 0;
    }
}

class AlphabeticalOrderComparator implements Comparator<String> {

    //Ok...but how can I compare 2 strings? I can't do this by using the .length method of course...
    //What I want to do is - if an string is alphabetically higher than another string, return 1 (i.e make it come
    //later in the list)

    //So, the way I can compare 2 strings alphabetically is by using a method of String called compareTo, as below:

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
    //The above is returning 1 IF s1 is greater than s2 (i.e. if s1 sorts alphabetically later than s2)
    //It returns -1 IF s1 is less than s2 (i.e. if s1 sorts alphabetically earlier than s2)
    //And it returns 0 if s1 and s2 are equal

    //compareTo is a method of the Comparable interface - we will be looking at this in more detail in the next tutorial
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    //If I want to sort my list of strings into reverse alphabetical order, all I have do is add a 'negative' sign
    //before s1 in the return statement:

    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }

}
