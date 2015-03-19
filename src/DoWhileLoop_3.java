import java.util.Scanner;

public class DoWhileLoop_3 {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        String myName;

        do {
            System.out.println("Can you guess what my name is...?");
            myName = name.nextLine();
        }
        while (!myName.equals("richard"));

        System.out.println("Yes, my name is indeed richard! Well done :-)");

    }
}