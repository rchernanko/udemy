package upcasting_and_downcasting_3;

public class Mac extends Laptop {

    @Override
    public void startLaptop() {
        System.out.println("Starting the Mac");
    }

    public void shutdownMac(){
        System.out.println("Shutting down the Mac");
    }
}
