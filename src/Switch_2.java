import java.util.Scanner;

public class Switch_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 5");

        int number = input.nextInt();

        switch(number){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                System.out.println("Well done you have chosen " + number);
                break;

            case 0:

                System.out.println("I said between 1 and 5 you fool!");
                break;

            default:
                System.out.println("Incorrect guess");
                break;
        }


    }
}
