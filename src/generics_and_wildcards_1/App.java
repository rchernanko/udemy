package generics_and_wildcards_1;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        showList(list);
        //In the above, I am passing the ArrayList of Strings (entitled 'list) to the showList method (see below).

    }

    public static void showList(ArrayList<String> list) {
        for (String things : list) {
            System.out.println(things);
            //Assign all the values in 'list' to a string called 'things' + then print out all the value in the 'things'
            //I have passed into the showList method
        }
    }

    //Making the above method static because I don't want to instantiate an App object
    //i.e. I don't have to write App app1 = new App();
    //If the method is static, I can call it within the same class (in this instance, App), and not have to instantiate
}
