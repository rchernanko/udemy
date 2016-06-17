package lesson6_arrays;

public class Arrays_1 {

    public static void main(String[] args) {

        int value = 7;
        // The above creates enough memory to hold an integer of 32 bits + then puts the value of 7 into that memory.

        int[] values = new int[4];
        // This is different to the above. Here, 'values' does not actually hold any integers. It is a reference
        // variable to a array of integers

        values[0] = 5;
        values[1] = 10;
        values[2] = 15;

        System.out.println("The value in array index 3 is " + values[3]);

        // In this instance (an array of ints), if i don't put any value in [3], java gives it a default of 0
        // You can also iterate through the values in an array using a for loop

        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};
        for(int t = 0; t < numbers.length; t++)
            System.out.println(numbers[t]);

    }

}
