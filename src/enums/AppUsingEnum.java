package enums;

public class AppUsingEnum {

    //Please read AppWithoutUsingEnum.java first

    //So the first thing I've done is create an enum class, Animal - let's have a look at that now.

    //Come back

    //When I use an enum, I no longer require constant values within my class (like I have at the top of
    //AppWithoutUsingEnum)

    public static void main(String[] args) {

        //So to add a value (which is restricted) to the variable animal, I do this:

        Animal animal = Animal.DOG;

        //What I'm saying in the above is that the variable animal is of type Animal (which is an enum)
        //And to assign a value to the variable animal, I first write the enum and then the value (Animal.DOG)

        //And then I can use my switch construct again:

        switch (animal) {

        //I can generate the below automatically with IntelliJ

        case CAT:
            System.out.println("I am an enum cat");
            break;
        case DOG:
            System.out.println("I am an enum dog");
            break;
        case MOUSE:
            System.out.println("I am an enum mouse");
            break;
        }

        //Note that there is no default in the switch construct above (thanks to the enum)

        //Enums are considered 'type-safe' because they restrict values that can be used

        //And that's about 90% of what you do with enums...pretty straightforward.

        //But let's now go back to the Animal.java (enum) class and look at some other things you can do with Enums.

        //Come back

        //Cat, dog and mouse are objects of the type Animal, as demonstrated below:

        System.out.println(Animal.CAT.getClass());

        //The below tells me whether Animal.Dog is an instance of the Animal enum.
        //It should return true

        System.out.println(Animal.DOG instanceof Animal);

        System.out.println(Animal.MOUSE instanceof Enum);

        //Enum is the parent of Animal
        //Animal is the parent of Mouse
        //Therefore the instanceof Enum should also return true

        //E.g. A car is an instance of cars (in general), which is an instance of a Machine

        //Let's go back to the Animal enum class + look at what else we can do with enums, starting with giving it a
        //constructor and even some methods!

        //I have created a getter method in my enum called getName, so let's now call that

        System.out.println(Animal.MOUSE.getName());

        //I can also override the toString method in the Animal enum class, so let's do that now. Go there now.

        //Come back

        //I've now implemented the toString and am now going to invoke it:

        System.out.println(Animal.DOG);

        //There are also some special methods that Animal inherits from Enum (java.lang.Enum).
        //One of these methods, name, will return the actual enum constant value as a String (turns an enum constant
        //into a String). This is particularly useful as I have also overriden the toString method within Animal.
        //Please see below:

        System.out.println("Enum name as a String : " + Animal.MOUSE.name());

        //And you can also do the reverse (get a String and turn it into an enum constant) with the valueOf method,
        //for example:

        //Here, I am assigning the value in the enum constant CAT into the animal2 reference variable.

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(animal2);

        //FYI - All Java.Lang classes (e.g. Enum, Math, Number etc) are automatically available to me, I don't
        //have to import them at the top of the class

    }
}
