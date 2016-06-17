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
