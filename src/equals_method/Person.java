package equals_method;

//First thing I've done is to create a Person blueprint with some variables, a constructor and a toString method.
//I generated the toString using right-click and generate sources.
//Note that the equals method was not added when I created the class, it was added later on.
//Please read down for more information

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }
}

//Next, I am going to create two Person objects (as below) and initialise their variables (via the constructor) with
//different values:

class App {

    public static void main(String[] args) {

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(8, "Sue");

        //I then try the below to find out whether these objects are equal or not,

        System.out.println(person1 == person2);

        //The result when I run the above is false.
        //BUT this is NOT because 5 is different to 8, or because Bob is different to Sue

        //With primitive types (e.g. int, double etc), the == tells me whether two primitive types have the same
        //value or not (as will be shown later on in this class)

        //HOWEVER, with non-primitive types (e.g. Person), the == tells me whether 2 references to objects are
        //pointing at the same object or not. It DOESN'T look at the contents of these objects at all.

        //So if I now assign person1 to point to the same object as person2, the result of the sout will be
        //true because both references will be pointing to the same object

        person1 = person2;

        System.out.println("After assigning the 2 references to the same object, the result is " + (person1 == person2));

        //So the KEY point here, to reiterate, is that using == with non-primitive types simply tells you whether
        //the references are pointing to the same object. It doesn't compare the contents of those 2 objects. I.e. it
        //won't give you any insight as to whether 5 is equal to 8, or whether Bob is equal to Sue.

        //To illustrate this even more, look at the below. The result when running this will be false (because the ==
        //ignores the contents of the two Person objects and simply tells you whether they're pointing to the same
        //object or not).

        //In terms of memory, person3 and person4 are pointing to 2 different objects, and with non-primitive types,
        //the contents are not compared when using ==

        Person person3 = new Person(13, "Richard");
        Person person4 = new Person(13, "Richard");

        System.out.println("Is person3 == to person4? The answer is " + (person3 == person4));

        //However, what we often want to do is to compare the actual contents of 2 objects, e.g. I want to compare
        //whether the contents of the object person1 is pointing to are the same as the in the object person2 is
        //pointing to

        //And this is where .equals comes in. See the below:

        System.out.println("Using the .equals method, the answer is : " + person3.equals(person4));

        //(The below description is true BEFORE I add the equals method to the Person class)......
        //Shock horror! When I actually run the above, the answer is still in fact false.....why????
        //The reason for this is that I am yet to have told the .equals method how to compare the 2 objects.

        //The way to do this is to override the .equals method (inherited from Object) and implement it
        //ourselves within the Person class

        //The easiest way to do this is to right-click within the Person class, choose generate 'equals and hashcode',
        //and then tick the fields that I feel are important to compare in the Person object. For example, if I
        //consider a Person object to be the same as another Person object ONLY if it has the same ID (and I don't care
        //about the "name" field), then I would choose to generate the equals method using ONLY the id. If I considered
        //a Person object to only be the same as another person object if it has the same id AND name, then I would select
        //both id and name when generating the equals method.

        //So in the above Person object, I have generated an equals method + have chosen to compare both the id and
        //name fields

        //So if I now run my code again, the sout above will result in "true" because the objects that my person3 and
        //person4 references are pointing to, have the same contents (as judged by the overriding .equals method).

        Person person5 = new Person(4, "John");
        Person person6 = new Person(4, "John");

        System.out.println("After implementing the overriding equals method, the result of == is : " + (person5 == person6));

        System.out.println("After implementing the overriding equals method, the result of " +
                ".equals is : " + (person5.equals(person6)));

        //To reiterate though, you can use == with primitive values, have a look at the below:

        double value1 = 7.2;
        double value2 = 7.2;

        System.out.println("Are the values in these doubles the same? The answer is " + (value1 == value2));

        int number1 = 6;
        int number2 = 6;

        System.out.println("Are the values in these integers the same? The answer is " + (number1 == number2));

        Integer int1 = 45;
        Integer int2 = 45;

        System.out.println(int1 == int2);

        //But be careful!!! I would expect the below to result in true, but it's actually false! So in some instances,
        //you must check whether the == (with primitive values) will actually give you the results you expect!

        Double double1 = 2.3;
        Double double2 = 2.3;

        System.out.println("Unexpectedly, the answer is " + (double1 == double2));

        //However, if I use the .equals method...the answer is different:

        System.out.println("With a .eqauls method (which is defined in the Double blueprint), " +
                "the answer is " + (double1.equals(double2)));

        //So be careful...

        //A classic beginners mistake is comparing Strings with == and not .equals.

        String text1 = "hello";
        String text2 = "hello";

        //In the case of the Strings and references above, because the values of the String objects are the same (i.e.
        //"hello"), Java has cleverly optimised and actually pointed text1 and text2 to the same String object...
        //(FYI - Note that the above is basically a shortcut for String text1 = new String("hello")).

        //So, when I compare the references text1 and text2 by using ==, while I would expect the answer to be false,
        //Java has optimised them to point at the same object, and so it is actually true.

        System.out.println("When I compare text1 and text2 using ==, the answer is : " + (text1 == text2));

        //Very tricky, be careful!!!

        //When comparing Strings (and their contents), the ONLY thing to do is to use the .equals method.

        System.out.println(text1.equals(text2));

        //The above will result "true"

        //TO SUMMARISE, DON'T USE == WITH NON-PRIMITIVE TYPES (INCLUDING STRINGS).
        //ALWAYS USE .EQUALS METHOD TO COMPARE THE CONTENTS OF NON-PRIMITIVE OBJECTS

        //To emphasise this even more, see the below:

        String text3 = "hello";
        String text4 = "helloqwerty".substring(0, 5);
        //The substring method extracts gets "hello" from the above String

        System.out.println(text4);
        //The above prints hello

        System.out.println(text3==text4);
        //The above results in false (which is of course correct, seeing as text3 and text4 are pointing to different
        //objects. So this basically emphasises that == does not compare the contents of these Strings (because they are
        //both "hello")

        //But if I want to check the contents of these Strings, the == is not going to give me that information.
        //Therefore, I should always ALWAYS use the .equals method

        System.out.println(text3.equals(text4));
        //The above will result in true
    }
}