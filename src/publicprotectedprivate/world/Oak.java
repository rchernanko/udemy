package publicprotectedprivate.world;

public class Oak extends Plant {

    public Oak(){

        //The next line won't work
        //type = "I am a type"
        //For reference, 'type' is a private variable in the Plant class.
        //Even though 'Oak' extends the 'Plant' class, it can still not access the 'type' variable.

        this.size = "Medium";

        //So what's going on above? Well, size is a 'protected' variable from the Plant class.
        //And because Oak extends the Plant class (is a subclass of Plant), I can access the protected variables from Plant in here.

        this.height = 4;

        //Above - 'height' is a variable with no modifier in the Plant class.
        //I can access 'height' here because Oak is in the same package as Plant (the class in which height was declared)
    }
}
