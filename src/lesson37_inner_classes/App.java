package lesson37_inner_classes;

public class App {

    public static void main(String[] args) {

        //1)
        //Pretty straightforward start. I've created a Robot class with some instance data, a constructor and a method,
        //"start", and have then accessed it within my main method here

        Robot robot = new Robot(7);
        robot.start();

        //2)
        //Now let's look at inner classes.
        //There are 3 cases of inner classes that John can think of - nested, static and local (within methods)
        //An anonymous class is also a kind of inner class, and there are 3 others that he covers in this tutorial

        //In Java you can create classes pretty much anywhere. The only rule is that you can only have one public
        //class per .java file and the class name has to be the same as the .java file name

        //So let's now add a nested inner class within Robot - go to the Robot class

        //7)

        robot.returnBrain();

        //Now go back to the Robot class to point 8

        //10)
        //I will now instantiate and access the static inner class Battery, see below:

        Robot.Battery battery = new Robot.Battery();
        battery.charge();

        //Now go back to Robot and look at point 11

        //12)
        //The below is me calling the shutDown method, which has an inner class in it (Temp).

        robot.shutDown();
    }
}
