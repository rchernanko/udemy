public class Inheritance_Car extends Inheritance_Machine {

    @Override
    public void machineStarting() {
        System.out.println("I am not starting because I don't want to");
    }

    @Override
    public void machineStopping() {
        System.out.println("I don't want to stop!");
    }

    public static void main(String[] args) {

        Inheritance_Car car1 = new Inheritance_Car();

        car1.setModelName("Ferrari");
        car1.setModelAge(3);

        System.out.println("Car 1 is a " + car1.getModelName());
        System.out.println("Car 1 is " + car1.getModelAge() + " years old");

        car1.machineStarting();
        car1.machineStopping();

    }
}
