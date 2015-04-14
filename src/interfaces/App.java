package interfaces;

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Richard");
        person1.greet();

        //so the below bit is what i don't get...

        Info info1 = new Machine();

        //I can do the above because Machine implements the Info interface
        //but my main question is why would you want (where is it useful) to define the variable as type Interface? I don't quite understand...why isn't info1 variable of type Machine?
        //How is the memory management working here also? One to talk through with Jay.

        info1.showInfo();

        //because the info1 variable is of type Info, I can only access the overriding methods within Machine that are implemented from the Info interface.
        //So i cannot see the non-overriding methods of Machine when I do info1.
        //So for example, I couldn't do info1.start - wouldn't be valid

        Info info2 = person1;

        //I can do this because person1 is a reference to a person object (which implements the Info interface)
        //So here, info2 would be pointing at the same thing/object as person1

        info2.showInfo();

        //So the above is going to run the overriding showInfo method within the Person class.

        //Need to come back to the below. It is intrinsically linked to the method below outputInfo
        //Not sure I understand this. Comes from the Udemy video at around 12 mins

        System.out.println();

        outputInfo(mach1);
        outputInfo(person1);
        //So in the above, I am passing mach1 and person1 respectively into the outputInfo method as arguments
    }

    private static void outputInfo(Info info){
        info.showInfo();
    }

}