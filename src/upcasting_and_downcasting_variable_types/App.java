package upcasting_and_downcasting_variable_types;


class Machine {

    public void start(){
        System.out.println("Machine starting.");
    }

}

class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Camera starting.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class App{
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //Casting in general is something that you do with variables
        //Before we start...
        //To make it clear, the object that the machine1 reference above is pointing to will ALWAYS be a Machine object
        //And similarly, the object that the camera1 reference above is pointing to will ALWAYS be a Camera object
        //However, you can change the variables that refer to them from one type to another (polymorphism)

        //*******UPCASTING********

        //Considered as 'safe'

        Machine machine2 = new Camera();

        //Here machine2 is pointing to an object of a child class type (Camera is a Machine)
        //Machine is the parent class, and so I can set machine2 to refer to a Camera child object
        //This is polymorphism in full flow

        Machine machine3 = camera1;

        //More subtly, because machine3 is of type Machine, and Camera extends Machine, I can also get a Machine type
        //variable, machine3, to point to the same Camera object as the reference camera1

        //And so in the above, I am setting machine3 to point at the same object that the camera1 is pointing to, a
        //Camera object

        //And so this is what is known as 'UPCASTING'. I have upcasted camera1 to machine3. It's called up because
        //I've gone 'up' the class hierarchy from Camera to Machine

        machine3.start();

        //The above will print out the Camera start method. Basically the reference machine3 points to a Camera
        //object, and so it is the start method within the Camera object that is called (not the Machine start method)

        //Very good explanation from John. It's like sticking a label on a car, and then asking the label to drive the car...
        //The label is only a reference to the car object. The car object itself is the thing that will do the
        //driving (not the label)

        /*

        machine2.snap();

        REALLY IMPORTANT TO KNOW THAT THE ABOVE WILL NOT WORK!!!!!!

        The reason for this is that it is the actual variable (and its type) that determines which methods you can call.
        In this case, the variable machine2 is of 'type' Machine, and Machine only has one method (start) that I can call

        GREAT SUMMARY:

        So the 'type' of my variable determines which methods I can call (e.g. 'Machine machine87' means that I can
        only call Machine methods).
        But it's the object that my variable refers to that determines which methods will actually be called
        (e.g. machine87.start will actually call the start method within the Camera object), because:

        Machine machine87 = new Camera();

         */

        //*******DOWNCASTING********

        Machine machine4 = new Camera();

        //My problem - I want to access the 'snap' method within the Camera object class but I can't because machine4
        //is of type Machine (and Machine only has 1 method, start)...

        //So how do I call snap? This is where downcasting comes in...

        //But note that downcasting is considered to be fairly risky and unsafe...you really need to think
        //carefully when using it

        Camera camera2 = (Camera) machine4;

        //Here I am casting a variable (machine4) of type Machine to a variable (camera2) of type Camera.
        //Because I am going down in the chain (from Machine to Camera), this is referred to as downcasting
        //This of course means that the variable camera2 can now access the snap method in the Camera object...
        //So now I can do this...

        camera2.snap();

        camera2.start();

        //One other thing to know - downcasting is quite risky because it won't show you certain errors until
        //runtime (which can sometimes be too late):

        Machine machine5 = new Machine();
        Camera camera3 = (Camera) machine5;

        //Here, the variable camera3 is now pointing to a Machine object.
        //There is nothing I can do to change the fact that camera3 is pointing to a Machine object (and not a camera object)...

        //So when I try to call Camera methods that the Machine object doesn't have...this gives me a
        //ClassCastException error on runtime

        camera3.start();
        camera3.snap();

        //I only see this problem at runtime, hence why it is compiling above with no problem...

        //So upcasting is a lot 'safer' than downcasting. I will want to be really certain of my code when downcasting...

        doStart(camera1);

        //See my notes on Polymorphism for further explanation to the above and below doStart
        //But basically what polymorphism allows me to do is to pass a Camera object / reference to the doStart method
        //The doStart method is actually expecting a Machine object / reference
        //But because Camera extends Machine, I can actually pass a Camera object instead (into doStart)
        //Polymorphism guarantees me that wherever a parent class is expected, I can use a child class of that parent instead

    }

    public static void doStart(Machine machine){
        machine.start();
    }
}
