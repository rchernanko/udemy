package static_variables_and_methods;

public class Static_Variables_And_Methods_2 {

    public static String stationType;
    public String stationName;
    public int stationZone;
    public static int count;
    public int stationId;
    public static final String STATION_CITY = "London";

    public Static_Variables_And_Methods_2(){
        stationId = count;
        System.out.println("The station id is : " + this.stationId);
        count++;
    }

    public void showStationNameAndZone(){
        System.out.println("This station is " + this.stationName + " it lies in zone " + this.stationZone);
    }

    public static void showStationTypeAndCity(){
        System.out.println(Static_Variables_And_Methods_2.stationType + " " + Static_Variables_And_Methods_2.STATION_CITY);
    }

}


class TubeStations{

    public static void main(String[] args) {

        Static_Variables_And_Methods_2.stationType = "tube";

        Static_Variables_And_Methods_2.showStationTypeAndCity();

        System.out.println("The number of stations declared so far is : " + Static_Variables_And_Methods_2.count);

        Static_Variables_And_Methods_2 station1 = new Static_Variables_And_Methods_2();

        System.out.println("The number of stations declared so far is : " + Static_Variables_And_Methods_2.count);

        station1.stationName = "Chigwell";
        station1.stationZone = 4;
        station1.showStationNameAndZone();

        Static_Variables_And_Methods_2 station2 = new Static_Variables_And_Methods_2();

        station2.stationName = "Marble Arch";
        station2.stationZone = 1;
        station2.showStationNameAndZone();

        System.out.println("The number of stations declared so far is : " + Static_Variables_And_Methods_2.count);
    }

}