import java.util.Scanner;

public class stringh {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "hello";
        System.out.println(s1 == s2);

        {
            int n = 11;
            if (n % 2 == 0) {
                System.out.println("even");

            } else {
                System.out.println("odd");
            }

        }
        {
            // by user chek even or not
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your value : ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Even");

            } else {
                System.out.println("odd");
            }

        }
        {
            int count = 1;
            do {
                System.out.print(count);
                count++;
            } while (count <= 10);
        }

        {
            // int n;
            for (int i = 1; i <= 10; i++) {
                if (i == 4) {
                    break;

                }
            System.out.println(" value count is : " + i);

            }
         System.out.println("I am not a loop.....");
        }
    }

}
