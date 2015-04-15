public class Static_Variables_And_Methods_1 {

    public String name;

    public static int age;
    //Static variables are shared amongst all objects. there is only one static variable that is shared by all object instances

    public static final int PINT_SIZE = 565;
    //Final keyword means the value in the variable PINT_SIZE is constant. I cannot assign something else to PINT_SIZE
    //E.g. I couldn't do PINT_SIZE = 3;
    //And because this is a static class variable, I can only access it by "classname.variablename" (see below)

    public static int count = 0;
    //Good use of static variables is to count how many object instances you have! (see below in richard class)

    public int id;
    //Another good use of static variables is to assign an id to each object instance (see constructor below + then richard class)

    public Static_Variables_And_Methods_1(){

        id = count;
        count++;
    }

    public void showNameAndId(){
        System.out.println(name + " this object instance's unique id is : " + id);
    }

    public static void showInfo(){
        System.out.println(age);
    }
    //Static method above. Can only be accessed via the class, not by object instances (classname.methodname)
    //Static methods can access static class variables (in this instance 'age'), but cannot access non-static variables (e.g. name)
    //Won't work in showInfo method : System.out.println(name);
    //BUT non-static methods can access static class variables.
    //Always remember that when an object instance is created, it already knows about the class (static) variables and methods. See below as an example.

    public void nonStaticMethodCanAccessStaticVariables(){
        System.out.println(age);
    }


}

class RichardStatic{

    public static void main(String[] args) {

        System.out.println("The count before any object instances are created is : " + Static_Variables_And_Methods_1.count);

        Static_Variables_And_Methods_1 test1 = new Static_Variables_And_Methods_1();

        System.out.println("The count after one object instance is created is : " + Static_Variables_And_Methods_1.count);

        Static_Variables_And_Methods_1 test2 = new Static_Variables_And_Methods_1();

        System.out.println("The final count is : " + Static_Variables_And_Methods_1.count);

        test1.name = "Richard";
        test2.name = "Lucy";

        test1.showNameAndId();
        test2.showNameAndId();

        Static_Variables_And_Methods_1.age = 3;
        //Here, I am accessing the static class variable by "class + variable" (i.e. not by test1 or test2, object instances)
        //Static variables can only be accessed via the class.
        //Object instances do not get any static variables.

        System.out.println(Static_Variables_And_Methods_1.age);

        Static_Variables_And_Methods_1.showInfo();
        //Here I am calling the static method via the class (i.e. not by an object instance)

        test1.nonStaticMethodCanAccessStaticVariables();

        System.out.println(Static_Variables_And_Methods_1.PINT_SIZE);

    }
}
