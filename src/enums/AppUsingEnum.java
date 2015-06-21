package enums;

public class AppUsingEnum {

    //Please read AppWithoutUsingEnum.java first

    //So the first thing I've done is create an enum class, Animal - let's have a look at that now.

    //Come back

    //When I use an enum, I no longer require constant values (like I have at the top of AppWithoutUsingEnum)

    public static void main(String[] args) {

        //So to add a value (which is restricted) to the variable animal, I do this:

        Animal animal = Animal.DOG;

        //What I'm saying in the above is that the variable animal is of type Animal (which is an enum)
        //And to assign a value to the variable animal, I first write the enum and then the value (Animal.DOG)

        //And then I can use my switch construct again:

        switch (animal) {

        //I can do the below automatically with IntelliJ

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

        //Enums are considered 'type-safe' because you restrict values that can be used

        //And that's about 90% of what you do with enums...

        //But let's now go back to the Animal.java (enum) class and look at some other things you can do with Enums.

        //Come back

        //Cat, dog and mouse are objects of the type Animal, as demonstrated below:

        System.out.println(Animal.CAT.getClass());

        //UP TO 9 minutes left

    }
}
