/*

1)

Abstract classes are something you can use when you want to start building a class hierarchy.
BUT the base class (the abstract class) is not going to be able to do anything itself - it will only act as a 'base' for
other classes

Next look at the comments in the Machine class (at the top)

 */

package lesson32_abstract_classes;

public class App {

    public static void main(String[] args) {

        Camera cam1 = new Camera();

        cam1.setId(5);

        Car car1 = new Car();

        car1.setId(7);

        //3) So at this point, the Machine class is not marked as abstract, i.e. it remains "public class Machine"

        //And then we start to question, why would we ever want to create an actual Machine object?
        //What would it do? What would it be used for?

        //We might decide that while there is a purpose of having a Camera or Car object, there is no real value in
        //instantiating a Machine class/object, because all Machine does is serve as a base that implements some common
        //functionality that a Machine has (for use by its child classes). There is no such thing as an abstract Machine
        //(in real life) - i.e. you can't go to a museum and view 'a machine', but you can a Camera and Car.

        //And so for that reason, we will now go back to the Machine.java class and change it to an abstract class.
        //Making a class abstract prevents the user from instantiating that Machine object.

        //4) So now that we have made the Machine class abstract, I can no longer do this:

        //Machine machine1 = new Machine();

        //I receive an error stating that Machine is an abstract class and cannot be instantiated.

        //Now let's go back to the Machine class and add some abstract methods.



        //7) So now I am going to call the run method from Machine.

        car1.run();
        cam1.run();

        //8) One thing that often confuses people is the fact that using abstract methods is very similar to using interfaces

        //Using an abstract class (with abstract methods) in e.g. Machine class, forces any subclasses, e.g. Camera +
        //Car, to implement those abstract methods. Similarly, if a class implements an interface, it would also be
        //forced to implement the interface's methods.

        //For that reason, a lot of people get confused as to when to use an abstract class and when to use an interface

        //There are several things to bear in mind when deciding.

        //The most key thing is that when you make a class a child of an abstract parent class, you are making a VERY
        //strong statement as to what that child class fundamentally is.

        //When you say that a child class fundamentally extends a parent class, it is a strong statement.
        //A camera IS a machine. A car IS a machine.

        //On the other hand, say we were to have an interface called Info with a method called 'showInfo', a machine could
        //implement this showInfo method, as could a building, as could a person etc etc (basically, things that aren't always
        //Machines). A camera doesn't have to be something to implement the Info interface, it is a bit more flexible.

        //Another thing to bear in mind is that a class can implement many interfaces, but can only extend from one
        //abstract (or non-abstract) parent class.

        //Extending from an abstract class is a real strong statement of the identity of that child class.

        //GREAT LINE:

        //The parent class determines what your child class is.
        //The interface simply determines one thing that the class does. It can do many different things by implementing
        //multiple interfaces

        //Another consideration is that you cannot have code in an interface, but you can in an abstract class.
        //In an interface, you're leaving the implementation completely up to the class that implements the interface.

    }

}
