package ch01_Fundamental;

import java.util.Arrays;

/**
 * @definition: Java does not have true multidimensional arrays. They are implemented as arrays of arrays.
 * @2-dimensionalArrayList: There are no two-dimensional array lists, but you can declare a variable of type ArrayList<ArrayList<Integer>> and build up the rows yourself.
 */

public class _8_9_MultidimensionArrays {
    public static void main(String[] args) {
        //2 DIMENSIONAL ARRAYS
        int[][] square = {
                {16,3,2,13},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1}
        };
        //get and set element
        System.out.println("square[1][2]: " + square[1][2]);
        int element = square[1][2]; //set element to 11
        System.out.println("square[1][2]: " + element);

        //SWAP ROWS
        int[] temp = square[0];
        square[0] = square[1];
        square[1] = temp;

        //initiate value
        int[][] square1 = new int[4][4];//first rows, then columns

        //PASCAL TRIANGLE
        int[][] triangle = new int[5][];
        for (int i = 0; i < 5; i++) {
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j=1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.printf("%4d", triangle[i][j]);
            }
            System.out.println();
        }

        for (int[] row : triangle) {
            for(int ele : row) {
                System.out.printf("%4d", ele);
            }
            System.out.println();
        }

        //PRINT OUT A LIST OF THE ELEMENTS OF A 2-DIMENSIONAL ARRAY
        System.out.println(Arrays.deepToString(triangle));
        System.out.println(Arrays.deepToString(square));
    }
}
