import java.util.Scanner;

public class parameterl {
    // for multiplication
    public static int hello(int num1, int num2) {
        int pro = num1 * num2;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("product is : " + pro);
        return 0;

    }

    // for addintion
    public static float substact(float a, float b) {
        float sub = a - b;
        return sub;

    }

    public static void main(String[] args) {
        hello(1, 2);
        float a = 20;
        float b = 2;
        float hello = substact(a, b);
        System.out.println(" a - b is : " + hello);
        substact(a, b);

    }
}