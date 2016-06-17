package lesson5_switches;

import java.util.Scanner;

public class Switch_5 {

    public static void main(String[] args) {

        Scanner drink = new Scanner(System.in);
        System.out.println("What's your favourite alcoholic drink");
        String favouriteDrink = drink.nextLine();

        switch(favouriteDrink){
            case ("beer") :
                System.out.println("Your favourite drink is beer");
                break;
            case ("wine") :
                System.out.println("Your favourite drink is wine");
                break;
            default :
                System.out.println("You'll drink anything with booze in it!");
                break;
        }
    }
}
