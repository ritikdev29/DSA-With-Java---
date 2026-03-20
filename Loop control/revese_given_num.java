import java.util.*;
import java.util.Scanner;

public class revese_given_num {
    public static void main(String[] args) {
        // int n = 10899;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for reverse : ");
        int n = sc.nextInt();
        int rev = 0;
        // int lastDigit;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;

        }
        System.out.println("Your Reverse number is : " + rev);

    }

}
