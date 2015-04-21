package publicprotectedprivate.defaultpackage;

import publicprotectedprivate.world.Plant;

public class App {

    public static void main(String[] args) {

        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(Plant.ID);

        //The below line of code won't work because 'size' is a protected variable in another package.
        //Protected variables can only be accessed by:
        //1) The class in which they are declared
        //2) Subclasses of the class in which they are declared
        //3) Classes within the same package as the class in which they are declared
        //System.out.println(plant.size); THIS WON'T WORK

        //The below line of code won't work because the variable 'type' is a private variable within the 'Plant' class
        //And remember - private variables can only be accessed within the class in which they are declared.
        //System.out.println(plant.type); THIS WON'T WORK

        //The below line of code won't work because the variable 'height' has no access modifier and is declared in the Plant class
        //The Plant class is in another package. Variables with no modifiers cannot be accessed by classes in another package
        //System.out.println(plant.height); THIS WON'T WORK
    }
}
