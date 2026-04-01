import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class livepractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("R ");
            }

            System.out.println();
        }

        /*
         * int rows = sc.nextInt();
         * int cols = sc.nextInt();
         * for(int i =1;i<=rows;i++){
         * for(int j=1;j<=cols;j++){
         * if (i==1||i==rows||j==1||j==cols) {
         * System.out.print("*");
         * 
         * }else{
         * System.out.print("R");
         * }
         * }
         * System.out.println();
         * }
         */

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.println();

        int s = 5;
        // outer loop
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s - i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // int marks [] = {88,55,68,99,94,67,93,88};
        int marks[] = new int[5];
        System.out.println("Enter Arrays element : ");
        // Scanner a = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        for (int b : marks) {
            System.out.print(b + " ");
        }
        Arrays.sort(marks);
        System.out.println("Array elemnt is :: ");
        for (int b : marks) {
            System.out.println(b + "  ");

        }

        // Array.sort(marks);

    }
}