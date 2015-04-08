package interfaces;

public class Person implements Info {
    //So the implements basically means - take the methods in the interface "Info" and make sure they are used here.

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
}
