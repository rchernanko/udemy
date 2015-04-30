package upcasting_and_downcasting_2;

import interfaces.Machine;

public class App {

    public static void main(String[] args) {

        //*** UPCASTING EXAMPLE ***

        FootballClub footballClub1 = new FootballClub();
        Spurs spurs1 = new Spurs();

        footballClub1.winAGame();
        spurs1.winAGame();
        spurs1.loseAGame();

        FootballClub footballClub2 = spurs1;

        //Here, I have upcasted spurs1 (which points at a Spurs object) to footballClub2 (which points at a FootballClub object)

        footballClub2.winAGame();

        // *** DOWNCASTING EXAMPLE ***


    }
}
