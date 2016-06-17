package lesson16_interfaces;

public class Person implements Info, SecondInterface {
    //So the implements basically means - take the methods in the interface "Info" and "SecondInterface"
    //and make sure they are used here.
    //A class can implement multiple interfaces at once. But can only extend from one parent class.

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
    //The above method is from / defined in the Info interface.
    //The @Override tag is not necessary but I think it is always best to leave it in.
    //It is a pointer to the compiler to say "this should be an overriding method - check that it is spelt in the correct way"
    //If you don't have the @Override and then spelt the method incorrectly e.g. showsInfo, then this would not be an
    //overriding method. It would instead be just another new method.
    //So always leave in

    @Override
    public void interfaceTestMethod() {
        System.out.println("This is a overridden method from the interface - SecondInterface");
    }
}
