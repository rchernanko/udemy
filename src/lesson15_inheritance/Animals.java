package lesson15_inheritance;

public class Animals extends Inheritance_Animal {

    @Override
    public void animalRoars() {
        System.out.println("I am roaring!!!!");
    }

    @Override
    public void animalGoesToSleep() {
        System.out.println("Ok, tonight I will go to sleep later");
    }

    public static void main(String[] args) {

    Animals lion = new Animals();
    Animals sheep = new Animals();
    Animals frog = new Animals();

        lion.setAnimalName("Larry the lion");
        lion.setAnimalHasATail(true);
        lion.setAnimalAge(12);

        System.out.println(lion.getAnimalName());
        System.out.println(lion.getAnimalHasATail());
        System.out.println(lion.getAnimalAge());

        sheep.setAnimalName("Susy the sheep");
        sheep.setAnimalHasATail(true);
        sheep.setAnimalAge(2);

        System.out.println(sheep.getAnimalName());
        System.out.println(sheep.getAnimalHasATail());
        System.out.println(sheep.getAnimalAge());

        frog.setAnimalName("Freddy the frog");
        frog.setAnimalHasATail(false);
        frog.setAnimalAge(4);
        frog.animalRoars();
        frog.animalGoesToSleep();

        System.out.println(frog.getAnimalName());
        System.out.println(frog.getAnimalHasATail());
        System.out.println(frog.getAnimalAge());

    }

}
