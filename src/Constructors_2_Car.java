public class Constructors_2_Car {

    private String carName;
    private int carValue;
    private int carAge;
    private double carEngineSize;

    public Constructors_2_Car() {

        this.carName = "The default car is a Ford Focus";
        this.carValue = 12_000;
        this.carAge = 13;
        this.carEngineSize = 1.6;

        System.out.println(this.carName);
        System.out.println("The default car has a value of £" + this.carValue);
        System.out.println("And it is roughly " + this.carAge + " years old");
        System.out.println("Its engine size is " + this.carEngineSize + " litres");
        System.out.println();
    }

    public Constructors_2_Car(String carName, int carValue, int carAge, double carEngineSize) {

        this.carName = carName;
        this.carValue = carValue;
        this.carAge = carAge;
        this.carEngineSize = carEngineSize;

        System.out.println(carName);
        System.out.println(carValue);
        System.out.println(carAge);
        System.out.println(carEngineSize);
        System.out.println();
    }

    public Constructors_2_Car(String carName, int carAge) {

        this.carName = carName;
        this.carAge = carAge;

        System.out.println("I am the third constructor and my car name is " + this.carName + " and my age is " + this.carAge);
    }

    public Constructors_2_Car(String carName, int carAge, int carValue){
        this("Mondeo", 23);
        //In the above line, I am calling a constructor within another constructor
        this.carName = carName;
        this.carAge = carAge;
        this.carValue = carValue;

        System.out.println(this.carName);
        System.out.println(this.carAge);
        System.out.println(this.carValue);

    }

}
