package lesson23_upcasting_and_downcasting_variable_types_3;

public class Mac extends Laptop {

    @Override
    public void startLaptop() {
        System.out.println("Starting the Mac");
    }

    public void shutdownMac(){
        System.out.println("Shutting down the Mac");
    }
}
