public class Constructors_Marc_Example {

    private String animalName;
    private int animalAge;

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalAge(int animalAge){
        this.animalAge = animalAge;
    }

    public int getAnimalAge(){
        return animalAge;
    }

    public Constructors_Marc_Example() {
    }

    //is this correct though???? Is this the right way to set up my private instance variables, with getters, setters and constructors?

    public Constructors_Marc_Example(String animalName, int animalAge){
        setAnimalName(animalName);
        setAnimalAge(animalAge);

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
