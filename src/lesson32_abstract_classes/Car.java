package lesson32_abstract_classes;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car starting.");
    }

    @Override
    public void doStuff() {
        System.out.println("Car doing stuff.");
    }

    @Override
    public void shutdown() {
        System.out.println("Car shutting down.");
    }
}
