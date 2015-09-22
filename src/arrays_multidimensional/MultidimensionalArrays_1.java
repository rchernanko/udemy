package arrays_multidimensional;

public class MultidimensionalArrays_1 {

    public static void main(String[] args) {

        int[][] grid = {
                {3, 5, 2322},
                {2131, 13432, 2344, 464},
                {2134, 2, 89, 3957, 32},
                {232, 3, 2321, 10}
        };

        System.out.println(grid[2][1]);
        System.out.println(grid[0][1]);

        String[][] names = new String[2][4];
        //think of the first value as how many arrays there will be
        //think of the second value as how long each array will be

        //From QA notes, the syntax of a multidimensional 2D array is : array_identifier = new type [number_of_arrays] [length];

        names[0][0] = "Richard";
        names[0][1] = "John";
        names[1][0] = "Sam";
        names[1][1] = "Simon";

        System.out.println(names[0][1]);

        System.out.println("The value in names.length is " + names.length);
        //names.length refers to how many rows / how many arrays there are in the multidimensional array (i.e. the first value, 2).

        for(int numberOfArrays = 0; numberOfArrays<names.length; numberOfArrays++){
            for(int arrayLength = 0; arrayLength<names[numberOfArrays].length; arrayLength++){
                System.out.print(names[numberOfArrays][arrayLength] + "\t");
            }
            System.out.println();
        }
    }
}
