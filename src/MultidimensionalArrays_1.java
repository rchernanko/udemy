public class MultidimensionalArrays_1 {

    public static void main(String[] args) {

        int[][] grid = {
                {3, 5, 2322},
                {2131, 13432, 2344},
                {2134, 2, 89}
        };

        System.out.println(grid[2][1]);
        System.out.println(grid[0][1]);

        String[][] names = new String[2][2];

        //From QA notes, the syntax of a multidimensional 2D array is : array_identifier = new type [number_of_arrays] [length];

        names[0][0] = "Richard";
        names[0][1] = "John";
        names[1][0] = "Sam";
        names[1][1] = "Simon";

        System.out.println(names[0][1]);

        for(int row = 0; row<names.length; row++){
            for(int col = 0; col<names[row].length; col++){
                System.out.print(names[row][col] + "\t");
            }

            System.out.println();
        }

    }
}
