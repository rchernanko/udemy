package arrays;

public class Arrays_3 {

    public static void main(String[] args) {

        String[] cities = new String[3];

        cities[0] = "London";
        cities[1] = "Manchester";
        cities[2] = "New York";

        System.out.println(cities[2]);

        for(String city : cities){
            System.out.println(city);

        //The above. When you use a :, you declare a string reference for each value in the array 'cities'.
        //So if I run this class now with 'sout', all values will be printed
        //You can read the above as 'for each city in the array cities, print out the city'
        }

    }




}
