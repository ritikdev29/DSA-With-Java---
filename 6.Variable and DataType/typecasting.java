import java.util.Scanner;
import java.util.*;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * not convert because int to float not possible
         * int number = sc.nextFloat();
         * System.out.println(number);
         * 
         */
        float number = sc.nextInt();
        System.out.println(number);
        {
            // explicit type casting
            double a = 102.56;
            int b = (int) a;
            System.out.println("Implicit conversion is : " + b);
            // 10.5 --> 10 this is narrow casting...
        }

        {
            int a = 5;
            double b = 2;
            double c = (double) a / b;
            System.out.println("your value is : " + c); // output is 2.5,,,, logic --> 5/2.0 = 2.5
        }
        {
            char ch = 'A';
            int num = ch;
            System.out.println("your value is: " + num); // output 65 --> javamai ASCII value mai conver ho java hai

        }

        {
            byte a = 10;
            byte b = 20;
            // byte c = a + b;
            // System.out.println(c);  // this line is compiler error java mia a+b int ban jata hai
            // soluntion
            byte c = (byte) (a+b); 
            System.out.println(c);// out = 30

        }
    }

}
