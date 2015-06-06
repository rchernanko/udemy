package arrays;

public class Arrays_3 {

    public static void main(String[] args) {

        String[] city = new String[3];

        city[0] = "London";
        city[1] = "Manchester";
        city[2] = "New York";

        System.out.println(city[2]);

        for(String favouritePlace : city){
            System.out.println(favouritePlace);

        //The above. When you use a :, you declare a string reference for each value in the array 'city'.
        //So if I run this class now with 'sout' (favouritePlace), all values will be printed
        }

    }




}
