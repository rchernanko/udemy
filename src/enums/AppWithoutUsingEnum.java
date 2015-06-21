package enums;

public class AppWithoutUsingEnum {

    //Before we get into enums in too much detail, let's look at what enums are intended to replace.

    //So we have a series of constant variables declared below and a variable 'animal' within the main method.
    //Animal can take on different values that represent different animals

    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int MOUSE = 2;

    //Why final? Because it makes the value a constant
    //Why static? Because it makes the value belong to the blueprint class which saves memory as these do not get
    //re-created when new object instances (of AppWithoutUsingEnum) are created

    public static void main(String[] args) {

        int animal = CAT;
        int animal1 = DOG;
        int animal2 = MOUSE;

        //I can also do stuff with the animal variable, for example, I can use it in a switch construct:

        switch (animal) {
        case CAT:
            System.out.println("Hello, I am a cat");
            break;
        case DOG:
            System.out.println("Hello, I am a dog");
            break;
        case MOUSE:
            System.out.println("Hello, I am a mouse");
            break;
        default:
            System.out.println("I am not any animal");
        }
    }

    //BUT A FEW PROBLEMS...

    //1)

    //I only want animal to represent a set of fixed values, in this case, cat, dog or mouse (0, 1 or 2)
    //However, in its current structure (i.e. not an enum), I could assign 'animal' any value, e.g. 100, and it
    //wouldn't be clear on what I mean
    //Basically I want to restrict animal to just 3 particular values - cat, dog and mouse

    //2)

    //I can't tell just by looking at 'animal', which values I can set it to. I need to know that the constant values
    //exist.

    //There is no indication as to which constant values I should be using UNLESS I am directly looking at the constants
    //declared at the top of this class

    //So let's say I want to use the 'animal' in a different class - it is a faff for me to then find out what the
    //constant values are (cat, dog, mouse). You might not even know that these constants exist...

    //So let's now go to the AppWithEnum.java to find out more about how we can resolve these problems by using enums.

}
