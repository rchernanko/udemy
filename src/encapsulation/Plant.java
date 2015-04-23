package encapsulation;

public class Plant {

    //The idea of good encapsulation is to always try keep your class instance variables private (if you can)
    //The idea of encapsulation is that you 'encapsulate' the inner workings of that class, inside the class
    //And encapsulation stops people outside that class getting at the guts of that class
    //Rather than making your instance variables public, you just expose a series of public APIs (public methods) for
    //people to be able to access the inner workings of that class

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //The above public getter and setter method can be used outside the class
    //Because I have used public getter and setter, I could change the inner workings of this class but hide this change
    //from other classes accessing this variable (i.e. i could change the details of String 'name', and it not have an adverse
    //effect on outside classes (who don't need to know about the changes I am making, so long as I'm not making a change to
    //the public APIs (the getter and setter methods)

    //Sometimes you do make the class instance variables public
    //This is usually when the variable is static and final
    //This is fine.

    public static final int PLANT_ID = 3;



    //If you have a method that is used just by the class itself, this can be made private
    //There is no need to expose it to outside classes. For example, the getData class is public and is accessible to the outside world
    //But it uses another method, calculateGrowthForecast, that is only ever used within the 'Plant' class
    //Therefore there is no need to make the calculateGrowthForecast method public, as you don't want anyone
    //to ever access it, other than the getData class. Therefore, we will make it private (see below)

    public String getData(){
        String data = "some stuff" + calculateGrowthForecast();
        return data;
    }

    private int calculateGrowthForecast(){
        return 9;
    }


    //IDEALLY you want to make everything in the class that you can, private
    //If it needs to be accessible in a subclass then make it protected
    //And make the stuff you want your end user to use, public. But try not to make any data public except for constants

    //The latter part of the tutorial gave a little tour of the Java API documentation (quite useful, we also covered this on the QA course)
}
