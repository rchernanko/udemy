package classes;

public class Classes_8_Cities {

    public static void main(String[] args) {

        Classes_8_City london = new Classes_8_City();
        Classes_8_City rome = new Classes_8_City();
        Classes_8_City paris = new Classes_8_City();

        london.cityName = "London";
        london.cityPopulation = 6_000_000;

        System.out.println("This city is called : " + london.getCityName());
        System.out.println("The population of " + london.getCityName() + " is " + london.getCityPopulation());
        System.out.println("The estimated number of commuters in " + london.getCityName() + " is : " + london.getEstimatedNumberOfDailyCommuters());

        rome.cityName = "Rome";
        rome.cityPopulation = 3_000_000;

        System.out.println(rome.getCityName());
        System.out.println(rome.getCityPopulation());
        System.out.println(rome.getEstimatedNumberOfDailyCommuters());

        paris.cityName = "Paris";
        paris.cityPopulation = 5_000_000;

        System.out.println(paris.getCityName());
        System.out.println(paris.getCityPopulation());
        System.out.println(paris.getEstimatedNumberOfDailyCommuters());

    }

}