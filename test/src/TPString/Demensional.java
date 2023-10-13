package TPString;

public class Demensional {

    int[][] exo07() {
        // Create a 10x10 2D array of integers.
        int array[][] = new int[10][10];

        // Nested loops to iterate over each element in the 2D array.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                // Initialize each element to 0.
                array[i][j] = 0;

                // If the current row index (i) is equal to the current column index (j),
                // set the element to the value of the row index (i).
                if (i == j) {
                    array[i][j] = i;
                }
            }
        }

        // Return the populated 2D array.
        return array;
    }
}
/*
 * Explanation:

The Demensional class contains a method named exo07 that returns a 2D array of integers.

Inside the method, a 10x10 2D array named array is created. It's initialized with zeros.

Two nested for loops are used to iterate over the rows and columns of the 2D array. The outer loop (indexed by i) iterates over the rows, and the inner loop (indexed by j) iterates over the columns.

For each element in the array, it is initially set to 0.

Within the loops, there's a condition: if the current row index (i) is equal to the current column index (j), it means the element is on the main diagonal (from top-left to bottom-right), and in this case, the element is set to the value of the row index (i). This creates a diagonal line of numbers from 0 to 9 in the 2D array.

After populating the array, it is returned.

This code generates a 2D array with a diagonal line of numbers where the value at each cell is equal to the row index when the row index is equal to the column index (i.e., the main diagonal).





 */
