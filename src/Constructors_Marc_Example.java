public class Constructors_Marc_Example {

    public String animalName;
    public int animalAge;

    public Constructors_Marc_Example(){
        this("Dog", 3);
    }

    public Constructors_Marc_Example(String animalName, int animalAge){
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
}

class Hello{

    public static void main(String[] args) {

        Constructors_Marc_Example test1 = new Constructors_Marc_Example();
        System.out.println(test1.animalName + test1.animalAge);

        Constructors_Marc_Example test2 = new Constructors_Marc_Example("Cat", 23);
        System.out.println(test2.animalName + test2.animalAge);

    }

}
