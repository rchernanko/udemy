public class Classes_3 {

    String carName;
    String carRegistration;
    int carAge;

    void describeCarDetails() {
        for (int i = 0; i < 3; i++) {
            System.out.println("This car is a " + carName + ". Its registration is " + carRegistration + " and it is " + carAge + " years old");
        }
    }

}
