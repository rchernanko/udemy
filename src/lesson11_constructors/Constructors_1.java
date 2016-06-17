package lesson11_constructors;

public class Constructors_1 {

    private String name;
    private int age;
    private int weight;
    private double height;

    public Constructors_1() {
        //A constructor is a special method that is run when a 'Constructors_1' object instance is created.
        //A constructor has no void in its method, and also has the same name as the class itself.

        //Every time you create an object, a constructor of some sort is run. You have to run a constructor to create
        //an object.

        this("Alex", 43);
        //The above "this" is calling the second constructor below. Therefore constructors can call other constructors
        //As well as being used for instance variables (e.g. this.name), "this" is also used for constructors.
        //The only rule here is that the "this" must be called first in any constructor method.

    }

    public Constructors_1(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println(this.name + " " + this.age);

    }

    public Constructors_1(String name, int age, int weight, double height){

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        System.out.println("This object instance has the name of " + this.name);
        System.out.println("This object instance has the age of " + this.age);
        System.out.println("This object instance has the weight of " + this.weight);
        System.out.println("This object instance has the height of " + this.height);
    }

}

class RichardTest {
    public static void main(String[] args) {
        Constructors_1 test1 = new Constructors_1();
        Constructors_1 test2 = new Constructors_1("Bertie", 25);
        Constructors_1 test3 = new Constructors_1("Jason", 38, 15, 6.2);
    }
}