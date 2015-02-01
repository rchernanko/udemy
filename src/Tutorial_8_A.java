import java.util.Scanner;

public class Tutorial_8_A {

    public static void main(String[] args) {

        Scanner richard = new Scanner(System.in);

        int number = 0;

        do {
            System.out.println("Please enter a number: ");
            number = richard.nextInt();
            System.out.println("No, that is incorrect");
            System.out.println();
        }
            while (number != 5);

            System.out.println("Yes, that guess is correct!");

        }
    }
