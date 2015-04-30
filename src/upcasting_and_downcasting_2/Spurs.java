package upcasting_and_downcasting_2;

public class Spurs extends FootballClub {

    @Override
    public void winAGame() {
        System.out.println("Spurs have won a game");
    }

    public void loseAGame(){
        System.out.println("Spurs have lost a game");
    }
}
