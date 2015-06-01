/*

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

        //So at this point, the Machine class is not classed as abstract, i.e. it remains "public class Machine"

        //And then we start to question, why would we ever want to create an actual Machine object (in this example,
        //within the App.java class)? What would it do? What would it be used for?

        //We might decide that while there is a purpose of having a Camera or Car object, there is no real value in
        //instantiating a Machine class, because all Machine does is serve as a base that implements some common
        //functionality that a Machine has (for use by its child classes). There is no such thing as an abstract Machine
        //(in real life) - i.e. you can't go to a museum and view 'a machine', but you can a Camera and Car.

        //UP TO 9 MINS 20 TO GO

    }

}
