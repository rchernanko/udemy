package classes;

public class Classes_3 {

    String carName;
    String carRegistration;
    int carAge;

    void describeCarDetails() {
        for (int i = 0; i < 3; i++) {
            System.out.println("This car is a " + carName + ". Its registration is " + carRegistration + " and " +
                    "it is " + carAge + " years old");
        }
    }

    //Of course, I don't need the for loop here, I could just have the sout line. Just done it as an example.

}
