//Anonymous classes are a way of either:

//1) Extending an existing class, or;
//2) Implementing an interface

//in such a way that you only need to do it once, it is a 'one-shot' thing.

//John says it is often quite useful

package anonymous_classes;

class Machine {
    public void start() {
        System.out.println("Machine starting");
    }
}

interface Plant{
    public void grow();
}

public class Anonymous_1 {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        machine1.start();

        //The above works fine.

        //But look what I do next...

        Machine machine2 = new Machine() {
            @Override
            public void start() {
                System.out.println("I am starting");
            }
        };

        machine2.start();

        //So what is happening above?

        //Similar to what I'd do in a subclass of Machine (e.g. Camera extends Machine), I have overriden
        //the 'start' method within Machine.

        //So in a way, everything from "new Machine()..." to "};" is actually a 'child' class of Machine
        //The type of this object is some child type of Machine BUT it doesn't actually have a name
        //HENCE, it is an anonymous class

        //There is no way I can create a new object from an anonymous class
        //But it is good as a 'one-shot' thing

        //And anonymous classes are also applicable for interfaces too...

        Plant plant1 = new Plant() {
            @Override
            //Override annotation is not really necessary for an interface (doesn't really make sense), but it's fine to leave in
            public void grow() {
                System.out.println("Plant growing");
            }
        };

        plant1.grow();

        //In the above, I am calling the method in the anonymous class

    }
}
