package upcasting_and_downcasting_2;

public class App {

    public static void main(String[] args) {

        FootballClub footballClub1 = new FootballClub();
        Spurs spurs1 = new Spurs();

        footballClub1.winAGame();
        spurs1.winAGame();
        spurs1.loseAGame();

        //*** UPCASTING EXAMPLE ***

        FootballClub footballClub2 = spurs1;

        //Here, I have upcasted spurs1 (which points at a Spurs object) to footballClub2 (which points at a FootballClub object)

        footballClub2.winAGame();

        // *** DOWNCASTING EXAMPLE ***

        FootballClub footballClub3 = new Spurs();

        //I can access the winAGame method within the Spurs object, but not the loseAGame method...so I now need to downcast

        Spurs spurs2 = (Spurs) footballClub3;

        //So in the above I have downcasted footballClub3 to spurs2. The variable 'spurs2' can now access the loseAGame method from the Spurs object

        spurs2.loseAGame();

    }
}
