package publicprotectedprivate.world;

public class Field {

    private Plant plant = new Plant();

    public Field(){
        System.out.println(plant.size);
    }

    //Above - the variable 'size' is a protected variable within the Plant class
    //And I can access it here because 'Field' is in the same package as 'Plant'
}
