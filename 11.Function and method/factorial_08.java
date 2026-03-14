import java.util.*;
import java.util.Scanner;

public class factorial_08 {
    public static int factorial(int n) {
        int f = 1;
        for (int i=1; i<=n; i++) {
            f = f * i;
        }
        return f; // function of n call
    }
    // by user 
    // function to calculate factorial
    static int fact(int n) {// ye user define functin method hai
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int biocoefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int biocoefficient = n_fact / (r_fact * nmr_fact);
        return biocoefficient;

    }


    public static void main(String[] args) {
        System.out.println(factorial(4));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of : " + n + " is " + result);
        System.out.println("Enter for biocoefficent first number : ");
        // int n = 
        // System.out.println("Your answer is Biocoefficent is : " +biocoefficient(5, 2));
    }

}