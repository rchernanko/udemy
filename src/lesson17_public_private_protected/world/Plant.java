package lesson17_public_private_protected.world;

/*

TO SUMMARISE

private - can access only within the class
public - can access from anywhere
protected - can access within the same class, within subclasses, and within the same package
no access modifier - can access within the same class, and within the same package

You cannot declare classes as private or protected
You can however declare a class without an access modifier, e.g. class Richard. But the class would only be visible within the file
You can only have one public class per file name and it must match the name of the 'file' (e.g. Help.java)

*/

public class Plant {

    //Below is bad practice. Why? See notes below...
    public String name;

    //Below is acceptable practice. Why? See notes below...
    public static final int ID = 1;

    public Plant(){

        name = "Paul the plant";

        type = "Plant";

        size = "Large";

        height = 6;

        //I can access the public variable 'name' absolutely anywhere in this class (Plant class).
        //In fact, I can access public variables absolutely anywhere in my project ('name' can be accessed in any other class).
        //For example, I will use it in the 'App' class.
        //As long as I have a reference to a Plant object, I can easily access 'name'.

        //BUT, public variables are bad practice!!! Does not encourage good encapsulation
        //You want people to only be able to access class variables via methods, so that you can control what's happening with them

        //If you do want to use a public variable though, most often you will make it a final / constant and static variable.
        //See for example, 'ID' above. This is static and final. Notice the naming conventions for the variable name are
        //in capital letters, "ID". And of course, because it is final, you must assign it a value when declaring it.

        //So to summarise, public variables can be accessed anywhere in your project.

        //'type' is a private variable (see comments below)

        //'size' is a protected variable (see comments below)

    }

    //Another type of modifier is 'private'.
    //Private means you can only access the variable within this class.
    //So if you create a private variable like I have done below, 'type', and it is private, I can only access it within the Plant class.
    //The 'Oak' class actually extends the Plant class. But just because it extends the class, it can still not access the 'type' variable.

    private String type;

    //Another type of modifier is 'protected'.
    //Private variables can't be accessed from the outside in a different class
    //But sometimes you want your variables to NOT be accessible outside the class BUT to be accessible in all child classes
    //And that is what protected is for...

    protected String size;

    //1) protected variables can be accessed within the class (as can private and public)
    //2) And they can also be accessed within child or 'subclasses' of Plant (i.e. ones that extend Plant - See 'Oak')
    //3) They can also be accessed by classes in the same package as the class in which they are declared (See 'Field' class)



    //Another type of modifier is no modifier!

    int height;

    //height doens't have a public, private or protected modifier.
    //I can access 'height' in a few different ways
    //1) Within the class in which it is declared, e.g. Plant
    //2) Within a class that is in the same package as the class in which the variable was declared, e.g. Oak

    //Even if a class in another package extends Plant, they will not be able to access a variable with no access modifier e.g. height
    //Variables with no access modifiers are only visible within the package in which they are declared (in the class)




}
