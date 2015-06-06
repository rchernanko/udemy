package for_and_while_loops;

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

        //What the above is basically saying is...do lines 12 and 13 while the value of number is not equal to 5
        //When it is equal to 5 then execute the line of code below

            System.out.println("Yes, that guess is correct!");

        }
    }
