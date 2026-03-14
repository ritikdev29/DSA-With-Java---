import java.util.*;

public class javabasic {
    public static void helloworld() {
        System.out.println("Hello world ! 1 ");
        System.out.println("Hello world ! 2 ");
        System.out.println("Hello world ! 3 ");
        System.out.println("Hello world ! 4 ");

    }

    public static void ritik() {
        // int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice for print hello world : ");
        int input = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello world \t Good morning...");
        }

    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the second value : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("Total sum of : " + c);

    }

    // i can create a calculator for using swich case statement
    public static void pankaj () {
    Scanner sc = new Scanner(System.in);
    System.out.print("1. for addition :\n 2. for substraction:\n 3.formultiplication\n 4 for divide : ");
    System.out.println("Enter first number : ");
    int r = sc.nextInt();
    System.out.println("Enter second  number : ");
    int k = sc.nextInt();
    int value;


    switch (sc) {
        case 1:
        
        System.out.println("The sum is : " +r+k);
            
            break;
    
        default:
            break;
    }
    }

    public static void main(String[] args) {
        // helloworld();
        helloworld();
        ritik();
        calculator();

    }
}