package interfaces;

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Richard");
        person1.greet();

    }

}
