/*

Read this after the DefineYourOwnNaturalOrder class notes.

So in the class above, we learnt how to define the natural order for custom objects via their name (a String).

Supposing I want to sort my custom-objects by something that's not a String or an Integer...? E.g. how about saying
that I want to sort by the length of my object's name...? There is a gotcha here that John takes us through.

So let's go straight to the compareTo method within PersonAgain class...

 */

package collections_framework_natural_order;

import java.util.*;

public class NextExample {

        public static void main(String[] args) {

            List<PersonAgain> peopleList = new ArrayList<PersonAgain>();
            Set<PersonAgain> peopleSet = new TreeSet<PersonAgain>();

            addElements(peopleList);
            addElements(peopleSet);

            Collections.sort(peopleList);

            showElements(peopleList);
            System.out.println();
            showElements(peopleSet);
        }

        public static void addElements(Collection<PersonAgain> col) {
            col.add(new PersonAgain("Richard"));
            col.add(new PersonAgain("Anne"));
            col.add(new PersonAgain("John"));
            col.add(new PersonAgain("Faheem"));
            col.add(new PersonAgain("Alex"));
        }

        public static void showElements(Collection<PersonAgain> col) {
            for (PersonAgain person : col) {
                System.out.println(person);
            }
        }
    }

class PersonAgain implements Comparable<PersonAgain> {

    private String name;

    public PersonAgain(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    //1) Here, I wish to sort my custom-objects by the length of my object's name...?
    //So let me implement that now (see below)...
    @Override
    public int compareTo(PersonAgain p1) {

        int len1 = name.length();
        int len2 = p1.name.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else return 0;
    }

    //2) HOWEVER, if I run the above PSVM (which prints out to console), within my TreeSet, only Anne, Faheem and
    //Richard are values - i.e. John and Alex are not stored in the TreeSet...

    //That's weird....? Why does this happen in the TreeSet?
    //(for reference, all names in the ArrayList are sorted correctly, by the length of name, and no objects are removed

    //The names that are missing (John and Alex) are of the same length as 'Anne'. And if you look at the documentation
    //for Comparable, it says that if there is a conflict in the notion of equality in a TreeSet
    //(equals method vs compareTo method)......


    //AT THIS STAGE, I AM NO LONGER WRITING NOTES DOWN. PLEASE REFER TO THE VIDEO IF THIS EVER CROPS UP IN MY CODING...
    //IS EASIER TO JUST WATCH THE VIDEO RATHER THAN TRY TO EXPLAIN IT IN HERE...

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        PersonAgain that = (PersonAgain) o;

        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
