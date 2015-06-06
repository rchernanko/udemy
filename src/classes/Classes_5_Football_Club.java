package classes;

public class Classes_5_Football_Club {

    String name;
    String stadiumName;
    int stadiumCapacity;
    String currentManager;

    public void obtainFootballClubDetails(){

        System.out.println(name + " play their football at " + stadiumName + ". The capacity of the stadium is " + stadiumCapacity);

    }

    public void obtainFootballClubManagerDetails(){

        System.out.println(name + "'s manager is " + currentManager);
    }

    int calculateDesiredStadiumCapacity(){

        int perfectAmount;

        perfectAmount = stadiumCapacity * 2;

        return perfectAmount;
    }
}
