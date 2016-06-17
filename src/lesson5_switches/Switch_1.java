package lesson5_switches;

import java.util.Scanner;

public class Switch_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a command");
        String text = input.nextLine();
        switch (text) {
            case "start" :
                System.out.println("Machine has started!");
                break;
            case "stop" :
                System.out.println("Machine has stopped!");
                break;
            default :
                System.out.println("Command not recognised, please either use start or stop");
                break;
        }
    }
}
