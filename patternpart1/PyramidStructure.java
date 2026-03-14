import java.util.*;

public class PyramidStructure {

    public static void hello() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ritikname() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("hello world !");

        }
    }

    public static void main(String[] args) {

        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println(); // next line

        }
        // print inverted pattern
        System.out.println("Inverted pramid print>>>>>>>>>");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= n - i + 1; star++) {
                System.out.print("*");

            }
            System.out.println();

        }
        // method se calla
        System.out.println("use method se calling star");
        hello();
        ritikname();
    }
}
