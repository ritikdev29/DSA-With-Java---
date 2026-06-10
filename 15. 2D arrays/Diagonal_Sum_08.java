import java.util.*;

public class Diagonal_Sum_08 {
    public static int diagonalsum(int matrix[][]) {
        int sum = 0;

      /*   for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];                       time complexity = O(n^2)

                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];

                }
            }
        }*/
        // return sum;
         for (int i = 0; i < matrix.length; i++) {
             // primary diagonal cndition --->
             sum += matrix[i][i];
                                                                // Time complexity = O(n)
             // secondary diagonal conditions --->

             if (i != matrix.length - 1 - i) {
                 sum += matrix[i][matrix.length - i - 1];

             }

         }
         return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // Diagonal_Sum_08();
        System.out.println(diagonalsum(matrix));

    }

}
