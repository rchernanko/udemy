import java.util.Scanner;

public class Tutorial_8_B {

    public static void main(String[] args) {

        Scanner football = new Scanner(System.in);

        String favouriteClub = "Premier League";

        do {
            System.out.println("Enter my favourite football club");
            favouriteClub = football.nextLine();
        }

            while (!favouriteClub.equals("Spurs"));

        /*
            I can add a comment in this way. Start with a /* and end with the opposite - see the below.
            When wanting to compare string values, I cannot use == as an operator.
            Instead, I use .equals.
            In the above, I also have an ! for not equals
        */

                System.out.println("Yes, my favourite club is Tottenham!");
            }
        }