import java.util.Scanner;

public class Switch_4 {

    public static void main(String[] args) {

        Scanner tube1 = new Scanner(System.in);

        System.out.println("Please enter a Tube line");

        String tubeChoice = tube1.nextLine();

        switch(tubeChoice){
            case "Central" :
                System.out.println("You have chosen the central line");
                break;
            case "Jubilee" :
                System.out.println("You have chosen the jubilee line");
                break;
            default :
                System.out.println("You have chosen another tube line");
                break;
        }
    }
}
