package inner_classes;

public class Robot {

    private int id;

    //3)
    //I'm now going to create a non-static inner class (inner classes are aka nested classes):

    private class Brain {

        //The inner class Brain now has access to the instance data of the Robot class
        //With this non-static inner class, I am accessing the instance data from the "outer Robot class"

        public void think(){
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    public Robot(int id){
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot " + id);

        //4)
        //Now that I have created the inner class Brain, I can use it in Robot methods too, like as below
        //There is also nothing stopping me from using Brain in the Robot constructor.

        Brain brain = new Brain();
        brain.think();
    }

    //5)
    //What are inner classes often used for???
    //Inner classes are used to logically group bits of an outer class together. For example, a Robot could also have
    //inner classes called leg, arm, head etc

    //Need to do a bit more reading on where and how these are used. Do we use them at all in our test framework?

    //JOhn says there is a good example of the use of inner classes in one of his future tutorials, the iterable
    //interface

    //6)
    //Can I use the above inner class, Brain, outside of the class it's declared in, e.g. can I use it within App.java?
    //It is common to use inner classes outside of the class it's declared in, but the way it's normally done is
    //as below:

    public Brain returnBrain() {
        return new Brain();
    }

    //Now go to point 7 within App.java to see where I am calling the returnBrain method (which returns a new instance
    //of Brain.

}
