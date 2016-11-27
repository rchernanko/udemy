/*

Interfaces:

e.g. i have 2 classes, Person and Machine.

They are not similar at all, but they both want a method to showInfo();

We could create an interface called Info, with a showInfo() method.

Person and Machine will then implement the Info interface


Analogy for interfaces:

-If you open a bank account, it's like doing a "new" on a class.
e.g. new Person();

- When you open a bank account, before you do so, you do a lot of research on things like interest rates, opening hours
etc. AND this makes you decide to go with one bank. i.e. this makes you decide to use the Person() object.

- Once you've opened it, you expect that the bank would have the same facilities as other banks e.g. paying money in,
taking money out etc. This is shared behaviour for all banks - and therefore these shared features could be stored
in an interface which the other classes then implements.

 */

package lesson16_interfaces;

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Richard");
        person1.greet();

        Info info1 = new Machine();

        //I can do the above because Machine implements the Info interface

        info1.showInfo();

        //because the info1 variable is of type Info, I can only access the overriding methods within Machine
        //that are implemented from the Info interface.
        //So i cannot see the non-overriding methods of Machine when I do info1.
        //So for example, I couldn't do info1.start - wouldn't be valid
        //The above is going to run the overriding showInfo method within the Machine class.


        //I have some great, great explanation of the above in the package polymorphism

        Info info2 = person1;

        //I can do this because person1 is a reference to a person object (which implements the Info interface)
        //So here, info2 would be pointing at the same thing/object as person1

        info2.showInfo();

        //So the above is going to run the overriding showInfo method within the Person class.

        System.out.println();

        outputInfo(mach1);
        outputInfo(info2);
        //So in the above, I am passing mach1 and person1 respectively into the outputInfo method as arguments
    }

    private static void outputInfo(Info info){
        info.showInfo();
    }

}
