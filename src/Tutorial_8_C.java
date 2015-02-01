import java.util.Scanner;

public class Tutorial_8_C {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        String myName = "default";

        do {
            System.out.println("Can you guess what my name is...?");
            myName = name.next();
            System.out.println();
        }
        while (!myName.equals("richard"));

        System.out.println("Yes, my name is indeed richard! Well done :-)");

    }
}