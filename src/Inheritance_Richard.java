public class Inheritance_Richard extends Inheritance_Person {

    //Because this class extends another, this class inherits the other fields and methods from the other class
    //Inheritance_Person is my parent class
    //Inheritance_Richard is my child class
    //Private fields and methods are not inherited - they cannot be accessed in the child class

    public void wakeUp(){
        System.out.println("I am waking up");
    }

    //In my child class, I can also override parent class methods, an example is as above.
    //Method signature must be the same for override to occur

    @Override
    public void goToSleep() {
        System.out.println("I am going to sleep");
    }

    //There is another way to override a method. In IntelliJ, right click anywhere in the class and then
    //'Generate'. And then select 'Override method'. You can then select what method you wish to override and
    //IntelliJ generates one for you (with a yellow @Override tag, see above). You can then change the code body
    //to what you want

    public static void main(String[] args) {

        Inheritance_Richard richard = new Inheritance_Richard();

        richard.name = "Richard";
        richard.eyeColour = "Brown";
        richard.waistSize = 34;

        richard.wakeUp();
        richard.lookAtEyesInMirror();
        richard.measureWaist();
        richard.goToSleep();

    }

}
