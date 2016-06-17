package lesson17_public_private_protected.defaultpackage;

import lesson17_public_private_protected.world.Plant;

public class App {

    public static void main(String[] args) {

        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(Plant.ID);

        //The below line of code won't work because 'size' is a protected variable in another package.

        //System.out.println(plant.size); THIS WON'T WORK

        //Protected variables can only be accessed by:
        //1) The class in which they are declared
        //2) Subclasses of the class in which they are declared
        //3) Classes within the same package as the class in which they are declared

        //The below line of code won't work because the variable 'type' is a private variable within the 'Plant' class

        //System.out.println(plant.type); THIS WON'T WORK

        //And remember - private variables can only be accessed within the class in which they are declared.

        //The below line of code won't work because the variable 'height' has no access modifier and is declared in the Plant class

        //System.out.println(plant.height); THIS WON'T WORK

        //The Plant class is in another package. Variables with no modifiers cannot be accessed by classes in another package
    }
}
