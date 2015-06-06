package classes;

public class Classes_8_City {

    String cityName;
    int cityPopulation;

    public String getCityName(){
        return cityName;
    }

    public int getCityPopulation(){
        return cityPopulation;
    }

    public int getEstimatedNumberOfDailyCommuters(){
        int commuters;
        commuters = (cityPopulation/100) * 70;
        return commuters;
    }
}