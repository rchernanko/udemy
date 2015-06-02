/*

1)

Abstract classes are something you can use when you want to start building a class hierarchy.
BUT the base class (the abstract class) is not going to be able to do anything itself - it will only act as a 'base' for
other classes

Next look at the comments in the Machine class (at the top)

 */

package abstract_classes;

public class App {

    public static void main(String[] args) {

        Camera cam1 = new Camera();

        cam1.setId(5);

        Car car1 = new Car();

        car1.setId(7);

        //3) So at this point, the Machine class is not classed as abstract, i.e. it remains "public class Machine"

        //And then we start to question, why would we ever want to create an actual Machine object (in this example,
        //within the App.java class)? What would it do? What would it be used for?

        //We might decide that while there is a purpose of having a Camera or Car object, there is no real value in
        //instantiating a Machine class, because all Machine does is serve as a base that implements some common
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

        //UP TO 4 mins 50 seconds to go

    }

}
