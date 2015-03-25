public class String_Builder_Formatting_2 {

    public static void main(String[] args) {

        String phone = "iPhone ";

        phone += "is ";
        phone += "a very ";
        phone += "good phone.";

        System.out.println(phone);

        StringBuilder phone2 = new StringBuilder();

        phone2.append("Samsung phones ");
        phone2.append("are also ");
        phone2.append("very good phones");

        System.out.println(phone2.toString());

        StringBuilder phone3 = new StringBuilder();

        phone3.append("Hi there").append(", my phone is ").append("better.");

        System.out.println(phone3.toString());

        ///// Formatting /////

        System.out.println("This is the first sentence\t This is my second sentence\nAnd this is my third sentence");

        // a "\t" creates a tab on the same line
        // a "\n" creates a new line

        System.out.println("Hi there\t\tmy name is richard\t\tand i am on the train\non a wednesday");

        System.out.print("This is my first sentence on the first line. ");
        System.out.println("And this is my second sentence, also on the same line because it is a 'print', not a 'println'");

        //sout (print) = doesn't create a new line after the text/variable is outputted.
        //sout (println) = does create a new line after the text/variable is outputted.

        System.out.printf("This is my current cost : %d and this is my final cost : %d\n", 5, 10);

        //sout (printf) = f stands for format. Doesn't create a new line after output.
        //sout (printf + %d) = allows you to format an integer. You can pass a value or variable into the sentence

        int age = 2;

        System.out.printf("This is my current age : %d\n", age);

        //You can also define the width (of characters) of a %d value by putting a number between the % and the d
        //See the examples below:

        System.out.printf("This is my quantity : %10d, and this is my age : %15d\n", 3, age);

        //If you do the above (define character width), you can also left align your value using a minus sign, see below:
        System.out.printf("This is my quantity : %-10d, and this is my age : %-15d another bit to show the 15 character gap\n", 5, 20);

        for(int i = 0; i<20; i++){
            System.out.printf("%-2d : some text here\n", i);
        }
        //The above is quite cool. This is an example of where the %d is better than simply concatenating strings together

        //As well as %d, there is %s, which allows you to format a string, see examples below:

        System.out.printf("This is a string and this %s is another string\n", "STRING");

        //As well as %d and %s, there is also %f, which allows you to format a floating point, quite useful, see below:

        System.out.printf("This is a floating point value : %f\n", 5.6);
        //This will print 5.600000 (just a default number of decimal points that java has chosen
        //But I can define how many decimal points I want my floating point value to be (when it is printed), see below.
        //I need to put a e.g. ".2" between the % and the f

        System.out.printf("This is another floating point value : %.2f", 5.63958403242);
        //The above will round up to 2 decimal places

        //got up to 17.10
    }
}
