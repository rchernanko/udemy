/*

2)

So the first thing I have done is to create three classes.
The parent class is Machine, and both Camera + Car are subclasses of Machine.
At this stage, the Machine class is not abstract (but you will see from the below that further changes have been made.
However, at the time of writing, the method signature is "public class Machine".

In the 'make-believe' program I'm about to build, the Camera and Car classes have several things in common, for example,
they both have Ids. And because they both extend from Machine, I can add a variable to Machine (plus some getters and
setters) + therefore Camera and Car will inherit - see the implementation below.

Next comment is after "car1.setId(7);" in the App.java class

*/

package lesson32_abstract_classes;

public abstract class Machine {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //5) So I've now addded abstract into the method signature and am now going to add some abstract methods.

    //Abstract classes can have abstract methods

    //I've decided that I want to force all Machines to have / implement a method 'start' (For my program I've thought
    //that every Machine (e.g. Camera and Car) must have a start method to start that particular machine).
    //To do that, I can add an abstract 'start' method to Machine.

    //Abstract methods are appropriate to use if I want to force the child classes of Machine to implement it, BUT at the
    //same time, I do not want to implement the method in the abstract class itself (e.g. because the implementation of
    //'start' will be different for every different type of Machine

    //So let's create the abstract method:

    public abstract void start();

    //As you notice, it's like the implementation within an interface, there is no logic, just the method signature.

    //And once I've written the above method, I am then forced to implement the method in Camera and Car (Machine's subclasses)
    //So I'll do that now.

    //6) Once I've done that...

    //And I can also call abstract methods within non-abstract methods, as below:

    public abstract void doStuff();
    public abstract void shutdown();

    public void run(){
        start();
        doStuff();
        shutdown();
    }

    //Of course, now that I have added 2 new abstract methods, I will now have to implement these in the subclasses of
    //Machine, Camera and Car. So I'll do that now.

    //So as you can see, I'm supplying quite a lot of the implementation in Machine, but am forcing the child classes to
    //implement the different details (their unique implementation)

    //And what I'll also now do, is call the run method in the App class (go to App class now).

}
