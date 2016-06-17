package lesson11_constructors;

public class Constructors_Marc_Example {

    private String animalName;
    private int animalAge;

    public String getAnimalName(){
        return animalName;
    }

    public int getAnimalAge(){
        return animalAge;
    }

    public Constructors_Marc_Example(String animalName, int animalAge){
        this.animalName = animalName;
        this.animalAge = animalAge;

        System.out.println("My name is " + getAnimalName() + " and I have been created through a constructor");
        System.out.println("My age is " + getAnimalAge() + " and I have been created through a constructor");
    }
}

class Hello{

    public static void main(String[] args) {

        Constructors_Marc_Example test1 = new Constructors_Marc_Example("Bailey", 3);

        Constructors_Marc_Example test2 = new Constructors_Marc_Example("Binky", 6);

    }

}
