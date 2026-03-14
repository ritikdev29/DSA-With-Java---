import java.util.*;
// package patternpart1;

public class halfpyramid {
    public static void main(String[] args) {
        int n = 50;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print("," + number);

            }
            System.out.println();

        }

        // character pattern
        int r = 4;
        char ch = 'A';
        for (int line = 1; line <= r; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;

            }

            System.out.println();

        }
    }

}
