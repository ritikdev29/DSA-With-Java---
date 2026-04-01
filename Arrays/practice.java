import java.util.*;

public class practice {
    public static void main(String[] args) {
        /*
         * int r= 5;
         * for(int i = 1; i<=r;i++){
         * for (int j=1;j<=r-i+1;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * // System.out.println();
         * int row= 4;
         * int col = 4;
         * for(int i = 1;i<=row;i++){
         * for(int j = 1;j<=col;j++){
         * if (i==1||i==row|| j==1||j==col) {
         * System.out.print("*");
         * 
         * }else{
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         */
        // i can print abcd patters
        int n = 4;
        char ch = 'R';
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}