package switches;

import java.util.Scanner;

public class Switch_3_QA {

    public static void main(String[] args) {

        Scanner month = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 12");

        int monthNumber = month.nextInt();

        switch(monthNumber){

                case 1:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to January");
                    break;

                case 2:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to February");
                    break;

                case 3:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to March");
                    break;

                case 4:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to April");
                    break;

                case 5:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to May");
                    break;

                case 6:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to June");
                    break;

                case 7:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to July");
                    break;

                case 8:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to August");
                    break;

                case 9:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to September");
                    break;

                case 10:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to October");
                    break;

                case 11:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to November");
                    break;

                case 12:
                    System.out.println("You have entered " + monthNumber + " . This corresponds to December");
                    break;

                default:
                    System.out.println("Invalid month. Please choose a number from 1 to 12");
                    break;

            }

        }
    }
