package lesson6_arrays;

public class Arrays_5_Looping {

    public static void main(String[] args) {

        int[] testArrays = new int[50];

        for(int i = 0; i<testArrays.length; i++){
            testArrays [i] = i;
            System.out.println(testArrays[i]);
        }

        String[] testStringArray = {"A", "B", "C", "D"};

        for(int i = 0; i<testStringArray.length; i++){
            System.out.println(testStringArray[i]);
        }
    }
}
