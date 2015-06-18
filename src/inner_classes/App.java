package inner_classes;

public class App {

    public static void main(String[] args) {

        //1)
        //Pretty straightforward start. I've created a Robot class with some instance data, a constructor and a method,
        //"start", and have then accessed it within my main method here

        Robot robot = new Robot(7);
        robot.start();

        //2)
        //Now let's look at inner classes.
        //There are 3 cases of inner classes that John can think of
        //An anonymous class is a kind of inner class, and there are 3 others that he covers in this tutorial

        //In Java you can create classes pretty much anywhere. The only rule is that you can only have one public
        //class per .java file and the class name has to be the same as the .java file name

        //So let's now add an inner class within Robot - go to the Robot class

        //7)

        robot.returnBrain();

        //UP TO 8 mins 40 seconds (accessing Brain classes)

    }
}
