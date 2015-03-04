public class Arrays_2 {

    public static void main(String[] args) {

        String[] names = new String[5];

        names[0] = "Richard";
        names[1] = "John";
        names[2] = "Fred";
        names[3] = "Jake";
        names[4] = "Andy";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        System.out.println("Now I am going to iterate through this array");

        for (int g = 0; g < names.length; g++) {
            System.out.println(names[g]);
        }

        // this shows how to get a value in the array and assign it to another variable

        String favouriteName = names[0];
        System.out.println("My favourite name is " + favouriteName);
    }
}
