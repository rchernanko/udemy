package getters_and_setters_and_this;

public class Setters_And_Getters_3_Animals {

    public static void main(String[] args) {

        Setters_And_Getters_2_Animal animal1 = new Setters_And_Getters_2_Animal();
        Setters_And_Getters_2_Animal animal2 = new Setters_And_Getters_2_Animal();
        Setters_And_Getters_2_Animal animal3 = new Setters_And_Getters_2_Animal();

        animal1.setAnimalName("Lion");
        animal1.setFavouriteFood("Meat");
        animal1.setRunningSpeed(50);

        System.out.println(animal1.getAnimalName());
        System.out.println(animal1.getFavouriteFood());
        System.out.println(animal1.getRunningSpeed());

        animal2.setAnimalName("Parrot");
        animal2.setFavouriteFood("Seeds");
        animal2.setRunningSpeed(0);

        System.out.println("I am a " + animal2.getAnimalName() + ". My favourite food is " + animal2.getFavouriteFood() + " and I can run " + animal2.getRunningSpeed() + " mph.");

        animal3.setAnimalName("Dog");
        animal3.setFavouriteFood("anything");
        animal3.setRunningSpeed(30);

        System.out.println(animal3.getAnimalName());
        System.out.println(animal3.getFavouriteFood());
        System.out.println(animal3.getRunningSpeed());
    }
}
