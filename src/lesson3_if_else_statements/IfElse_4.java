package lesson3_if_else_statements;

import java.util.Scanner;

public class IfElse_4 {

    public static void main(String[] args) {

        Scanner richard = new Scanner(System.in);
        String name;
        System.out.println("Please enter the correct name");
        name = richard.nextLine();
        if (name.equalsIgnoreCase("Richard")){
            System.out.println("Richard is the correct name");
        } else {
            System.out.println("Incorrect guess");
        }

    }
}
