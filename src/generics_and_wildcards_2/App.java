package generics_and_wildcards_2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Machine> machine = new ArrayList<>();

        machine.add(new Machine());

        ArrayList<Camera> camera = new ArrayList<>();

        camera.add(new Camera());

        //I need to keep reading down to understand what these showLists are doing / are for

        showList(machine);

        showList1(camera);

        showList2(machine);

        showList2(camera);
        //Because camera extends machine, camera inherits the 'start' method in Machine and therefore prints 'Machine starting'

        showList3(machine);
    }

    public static void showList(ArrayList<Machine> machine) {
        for (Machine things : machine) {
            System.out.println(things);
        }
    }

    //In the showList method, I am able to pass ArrayList<Machine> into it

    //However, what is important to know is that I cannot pass an ArrayList of Cameras (ArrayList<Camera>)
    //The method showList above only excepts an ArrayList of Machines

    //Just because Camera extends Machine DOES NOT MEAN that ArrayList<Camera> extends ArrayList<Machine>

    //So if I were to write 'showList(camera);' in the 'App' class above, this would not compile


    ///////// WILCARDS /////////


    //BUT there is another way that I can pass an ArrayList of Cameras into the showList method...

    //I can use something called a 'wildcard' in between the parameterised type brackets. See the showList1 method below...

    //The wildcard symbol is ?

    //? = a class of unknown type

    //If I use a wildcard, this means that I can pass any object as a parameterised type into the ArrayList (in this instance)

    //The disadvantage of this though = Because the showList1 method does not know which class I will pass into it (as a parameterised type),
    //I have to use 'Object' in my for loop (because all classes are subclasses of the parent class 'Object')
    //And the use of Object means that I CANNOT CALL / access any Camera or Machine specific methods (unless I use casting, which can be complicated)

    public static void showList1(ArrayList<?> list) {
        for (Object things1 : list) {
            System.out.println("Showlist1 : " + things1);
        }
    }

    //I have then added the line 'showList1(camera)' within the main method of 'App' + this will now work


    ////////// WILDCARD UPPER BOUNDS //////////


    //There are a few other things you can do with wildcards
    //One is that you can specify an upper bound to the wildcard

    //So the scenario is - I want to pass an ArrayList of Machines or ANY subclass of the parameterised type 'Machine' to showList1...
    //For ease, I will create a new method 'showList2' (to demonstrate)

    public static void showList2(ArrayList<? extends Machine> list){
        for (Machine things2 : list) {
            System.out.println("showlist2 : " + things2);
            things2.start();
        }
    }

    //The '? extends ...' means that I can pass in any class that extends Machine into showList2 (in this case, as a
    //parameterised type of ArrayList)
    //And this also means that I can also call / access Machine type methods, e.g. things1.start();

    //BUT if I pass a camera object into showList2, I can only call the Machine methods...not the camera ones...so I
    //can't call 'snap'.


    ////////// WILDCARD LOWER BOUNDS //////////


    //You can also specify a lower bound to a wildcard (but it is not as useful) - see showList3 below

    //The '? super Camera' means that I can pass in any class that is Camera OR a super class of Camera (in this case, as a
    //parameterised type of ArrayList)
    //BUT again, I have to use 'Object' in my for loop (because showList3 doesn't know what I am going to pass into it)
    //So I cannot call Camera methods, only Object methods

    //Because of the above line, the only real use of lower bound wildcard is to call the toString() method..see below

    public static void showList3(ArrayList<? super Camera> list){
        for (Object things3 : list){
            System.out.println(things3);
        }
    }

    //The only way I can access Machine or Camera methods in the above is by using casting + also
    //be absolutely certain of what object was actually being passed into the showList3 method

}

//John has said that the wildcard information above is not the most important stuff to know in Java, but can be very useful
