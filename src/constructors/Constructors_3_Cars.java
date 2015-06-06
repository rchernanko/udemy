package constructors;

public class Constructors_3_Cars {

    public static void main(String[] args) {

        Constructors_2_Car car1 = new Constructors_2_Car();
        //Here I am creating a new object instance and also calling the first Constructor in the 'Constructors_2_Car' class.
        //Constructors are used a lot to create object instances with instance variables automatically assigned
        //I.E you don't have to then write code to declare/initialise instance variables for your new object instance,
        //you can do it using a constructor

        Constructors_2_Car car2 = new Constructors_2_Car("Toyota", 25_000, 4, 2.4);
        //Here I am creating a new object instance and also calling the second constructor in the 'Constructors_2_Car' class.

        Constructors_2_Car car3 = new Constructors_2_Car("Ferari", 3);

        Constructors_2_Car car4 = new Constructors_2_Car("Bentley", 3, 120_000);
    }
}
