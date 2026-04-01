import java.util.*;

public class solid_rhombus {
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // public static void Hollow_Rhombus_Pattern(int n)

    }

    public static void Hollow_Rhombus_Pfttern(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // hollow rectangle stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.println();

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        rhombus(5);
        Hollow_Rhombus_Pfttern(5);

    }
}
