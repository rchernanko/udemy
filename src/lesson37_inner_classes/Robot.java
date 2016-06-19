package lesson37_inner_classes;

public class Robot {

    private int id;

    //3)
    //I'm now going to create a nested (and non-static) inner class, Brain:

    private class Brain {

        //The inner class Brain now has access to the instance data of the Robot class
        //With this non-static nested inner class, I am accessing the instance data from the "outer Robot class"

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
        //As an FYI, there is also nothing stopping me from using Brain in the Robot constructor.
        //Have a look at the App.java. Where I am calling the start method, the brain.think is also being called

        Brain brain = new Brain();
        brain.think();
    }

    //5)
    //So what are inner classes often used for???
    //Inner classes are used to logically group bits of an outer class together. For example, a Robot could also have
    //inner classes called leg, arm, head etc

    //Need to do a bit more reading on where and how these are used. Do we use them at all in our test framework?

    //John says there is a good example of the use of inner classes in one of his future tutorials, the iterable
    //interface

    //6)
    //Can I use the above inner class, Brain, outside of the class it's declared in, e.g. can I call / use it within
    //App.java?

    //It is common to use inner classes outside of the class it's declared in, but the way it's normally done is
    //as below - ie. it is returned in a method call.

    public Brain returnBrain() {
        return new Brain();
    }

    //Now go to point 7 within App.java to see where I am calling the returnBrain method (which returns a new instance
    //of Brain.

    //8)
    //As an FYI, when you create an instance of Robot (in App.java), you do not automatically create an instance of
    //the inner class Brain. Instead, you have to do it explicitly somewhere, and this is usually done within the
    //Robot class itself, within a method. In this instance, it is done inside "start".

    //You can actually create an instance of Brain outside the Robot class, but it is much much more common to do it as
    //per the above (start + return Brain methods).

    //The tutorial actually shows you how to create an instance of Brain outside the Robot class, but I have not done this here

    /////////// SECOND TYPE OF INNER CLASS ////////////

    //9)
    //A second type of inner class is the 'Static inner class'

    public static class Battery {
        public void charge() {
            System.out.println("Battery charging");
        }
    }

    //Because the above inner class is static, we cannot access non-static Robot instance variables (e.g. id)
    //If 'id' was static, the static class Battery would be able to access it.

    //What are static inner classes used for? I need to do some reading on this, I don't really get it. Ask one of the
    //others

    //Either way, head to the App.java and point 10 to see how the static Battery class is instantiated and accessed.

    /////////// THIRD TYPE OF INNER CLASS ////////////


    //11)
    //Another point - you can even create a new class inside a method (the third type of inner class):

    public void shutDown() {

        final String name = "Richard";

        System.out.println(name + " is shutting down");

        class Temp {

            public void doSomething() {

                System.out.println("ID is : " + id);

                //So as you can see, this inner class (Temp) has access to the Robot instance variable 'id'

                //'Temp' can also access the local variable 'name' as declared within the shutDown method itself.
                //However, just like anonymous classes, the Temp class can only access 'name' if it is declared 'final'

                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }

    //So now, when I call robot.shutdown (in App.java), the above Temp will be instantiated and the doSomething method
    //will be called. Have a look (see point 12)

    //So Temp can only be accessed from another class when calling the shutDown method.

}
