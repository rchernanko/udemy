package lesson16_interfaces;

public class Machine implements Info {
    //So the implements basically means - take the methods in the interface "Info" and make sure they are used here.

    private int id = 7;

    public void start(){
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
    //The above method is from / defined in the Info interface.
    //The @Override tag is not necessary but I think it is always best to leave it in.
    //It is a pointer to the compiler to say "this should be an overriding method - check that it is spelt in the correct way"
    //If you don't have the @Override and then spelt the method incorrectly e.g. showsInfo, then this would not be an
    //overriding method. It would instead be just another new method.
    //So always leave in
}
