import java.util.Scanner;
public class practice {
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i<=n; i++) {
            f = f * i;
            
        }
        return f;
        
    }
    public static int add(int a ,int b){
        int ad = a*b;
        return ad;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to find factorial: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Your answer is " + n + " is "+ result);
        System.out.println();
         add(2, 4);


        
    }
}