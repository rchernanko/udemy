package inheritance;

public class Inheritance_Animal {

    private String animalName;
    private boolean animalHasATail;
    private int animalAge;

    /*

    If I wanted to do the setters as a constructor, it might look like this:

    public Inheritance_Animal(String animalName, boolean animalHasATail, int animalAge){
        this.animalName = animalName;
        this.animalHasATail = animalHasATail;
        this.animalAge = animalAge;
    }

     */

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName(){
        return this.animalName;
    }

    public void setAnimalHasATail(boolean animalHasATail){
        this.animalHasATail = animalHasATail;
    }

    public boolean getAnimalHasATail(){
        return this.animalHasATail;
    }

    public void setAnimalAge(int animalAge){
        this.animalAge = animalAge;
    }

    public int getAnimalAge(){
        return this.animalAge;
    }

    public void animalRoars(){
        System.out.println("ROOOOOOOAAAARRRR");
    }

    public void animalGoesToSleep(){
        System.out.println("Tonight I'm going to sleep at 9pm");
    }
}
