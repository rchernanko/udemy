package equals_method;

//First thing I've done is to create a Person blueprint with some variables, a constructor and a toString method.

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

}

//Next, I am going to create two Person objects (as below) and initialise their variables (via the constructor) with
//different values:

class App {

    public static void main(String[] args) {

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(8, "Sue");

        //If I want to know whether these objects are equal or not, I can do the below:

        System.out.println(person1 == person2);

        //The result when I run the above is false.
        //Now with primitive types (e.g. int, double etc), the == tells me whether two primitive types have the same
        //value or not

        //HOWEVER, with non-primitive types (e.g. Person), the == tells me whether 2 references to objects are
        //pointing at the same object or not...

        //So if I now assign person1 to point at the same object as person2, the result of the sout will be
        //true because both references will be pointing to the same object

        person1 = person2;

        System.out.println("After assigning the references to the same object, the result is " + (person1 == person2));

        //So the KEY point here is, to reiterate, is that using == with non-primitive types simply tells you whether
        //the references are pointing to the same object. It won't be comparing the contents of that object. I.e. it
        //won't give you any insight as to whether 5 is equal to 8, or whether Bob is equal to Sue.

        //To illustrate this even more, look at the below. The result when running this will be false (because the ==
        //ignores the contents of the two objects and simply tells you whether they're pointing to the same object or
        //not. In terms of memory, they are 2 different objects, and their contents are irrelevant when using a == (with
        //non-primitive types).

        Person person3 = new Person(13, "Richard");
        Person person4 = new Person(13, "Richard");

        System.out.println("Is person3 == to person4? The answer is " + (person3 == person4));

        //What we often want to do is to compare the contents of objects, e.g. I want to compare whether the contents
        //of person1 is the same as person2





    }


}
