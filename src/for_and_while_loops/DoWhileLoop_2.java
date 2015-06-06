package for_and_while_loops;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class DoWhileLoop_2 {

    public static void main(String[] args) {

        Scanner football = new Scanner(System.in);

        String favouriteClub;

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