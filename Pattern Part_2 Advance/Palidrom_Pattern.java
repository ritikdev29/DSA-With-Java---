import java.util.*;

public class Palidrom_Pattern {
    public static void hello(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // decending
            for (int j = i; j >= 1; j--) {
                System.out.print(j); // hur j ki value change hoti rahti hia
            }
            // acending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hello(4);
        // Palidrom_Pattern(4);

    }
}
