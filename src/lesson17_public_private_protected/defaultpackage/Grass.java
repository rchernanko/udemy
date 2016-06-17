package lesson17_public_private_protected.defaultpackage;

import lesson17_public_private_protected.world.Plant;

public class Grass extends Plant {

    public Grass(){

    //System.out.println(this.height);

    //The above won't work.
    //Even though the variable 'height' is in the class Plant (and Grass extends Plant), because 'height' has no access modifier,
    //i cannot access it in another package. Variables with no access modifiers (e.g. height) have package level visibility only.
    //It doesn't matter that Grass extends Plant

    }
}
