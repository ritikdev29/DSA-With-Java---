import java.util.Scanner;

public class question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Number is even");

        } else {
            System.out.println("number is odd...");
        }

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }

}
