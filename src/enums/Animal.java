package enums;

public enum Animal {
    CAT("Penny"), DOG("Bailey"), MOUSE("Jerry");

    //You might wonder what cat, dog and mouse are...
    //Well, they are actually objects + they are of the type Animal
    //Is really important to know that CAT, DOG and MOUSE are not Strings, they are special objects (enum constants)
    //But I can turn them into a String using the enum name method (see AppUsingEnum.java).
    //Please ignore the names in brackets, these are explained later on (in the notes below)

    //To show this, go back to AppUsingEnum and look at the sout (Animal.DOG.getClass());

    //Come back

    //So I am now going to give the Animal enum a constructor

    //You can't actually declare the constructor in an enum as public, only private (or just leave it as Animal() { })

    //In this case, I'll set it as private.

    //Also, just like in a normal class, I'll give the Animal enum an instance variable 'name'

    private String name;

    private Animal(String name) {
        this.name = name;
    }

    //Now that I have added a String parameter to the Animal constructor, I am now forced to add values to the
    //CAT, DOG, MOUSE instances I declared at the top of this enum (Penny, Bailey and Jerry)

    //So I'll do that now. Done.

    //And now I'll give it a getter

    public String getName() {
        return name;
    }

    //Right, let's do something with this now. Let's call getName from the AppUsingEnum class. Go there now.

    //Come back

    //I can also override the toString method in the Animal enum class:

    public String toString() {
        return "This animal is called: " + name;
    }

    //So now, when I call sout(Animal.DOG) in the AppUsingEnum class, "Bailey" should be printed. Go to that class now.



}
