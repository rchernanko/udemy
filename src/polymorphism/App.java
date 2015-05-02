package polymorphism;

public class App {

    //Polymorphism is a fundamental part of Object Orientated Design

    //What is polymorphism?

    //In a nutshell, if you have a child class of some parent class, you can always use the child class anywhere where you'd normally use the parent class

    //Some examples below...

    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = plant1;
        //Both plant1 and plant2 are referring to the same Plant object

        //Polynorphism allows me to do this...

        Plant plant3 = tree;

        //The tree variable reference is pointing at a Tree object.
        //And because Tree is a subclass of Plant, I can also point plant3 to a Tree object (via the 'tree' variable reference)
        //Of course, this also allows me to do the below...
        //Plant plant4 = new Tree();

        plant3.grow();

        //The above will call the grow method in the Tree object...
        //It doesn't matter if plant3 is a Plant type variable. It is pointing at a Tree object, so will access the grow method in Tree

        tree.shedLeaves();

        //But i can't do the below...
        //plant3.shedLeaves();

        //The reason for this is that it is the actual variable (and its type) that determines which methods you can call.
        //In this case, the variable plant3 is of 'type' Plant, and Plant only has one method (grow) that I can call

        //GREAT SUMMARY:

        //So the 'type' of my variable determines which methods I can call (e.g. 'Plant plant45' means that I can only call Plant methods)
        //But it's the object that my variable refers to that determines which methods will actually be called (e.g. plant45.grow will actually
        //call the start method within the Tree object, because:

        //Plant plant45 = new Tree();

        //See my notes on upcasting and downcasting for further explanation

        doGrow(tree);
    }

    //Another great thing with Polymorphism is the below...

    public static void doGrow(Plant plant) {
        plant.grow();
    }

    //See above 'doGrow(tree)'

    //I can pass the 'tree' reference (to a Tree object) into doGrow
    //This is because Tree is a subclass of Plant
    //So even though the doGrow method is expecting a Plant object, we can pass it a Tree object (as Tree extends Plant)

    //Polymorphism guarantees me that wherever a parent class is expected, I can use a child class of that parent instead

}
