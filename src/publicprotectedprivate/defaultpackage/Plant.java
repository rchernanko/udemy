package publicprotectedprivate.defaultpackage;

public class Plant {

    //Below is bad practice. Why? See notes below...
    public String name;

    //Below is acceptable practice. Why? See notes below...
    public static final int ID = 1;

    public Plant(){
        name = "Paul the plant";

        //I can access the public variable 'name' absolutely anywhere in this class (Plant class).
        //In fact, I can access public variables absolutely anywhere in my project ('name' can be accessed in any other class).
        //For example, I will use it in the 'App' class.
        //As long as I have a reference to a Plant object, I can easily access 'name'.

        //BUT, public variables are bad practice!!! Does not encourage good encapsulation
        //You want people to only be able to access them via methods, so that you can control what's happening with them

        //If you do want to use a public variable though, most often you will make it a final / constant and static variable.
        //See for example, 'ID' above. This is static and final. Notice the naming conventions for the variable name are
        //in capital letters, "ID". And of course, because it is final, you must assign it a value when declaring it.

        //So to summarise, public variables can be accessed anywhere in your project

        //UP TO 5 MINS IN VIDEO

    }
}
