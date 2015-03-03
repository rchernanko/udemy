import java.util.Scanner;

public class DoWhileLoop_1 {

    public static void main(String[] args) {

        Scanner richard = new Scanner(System.in);

        int number;

        do {
            System.out.println("Please guess a number: ");
            number = richard.nextInt();
        }
            while (number != 5);

            System.out.println("Yes, that guess is correct!");

        }
    }
