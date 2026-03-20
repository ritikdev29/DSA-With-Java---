import java.util.*;
public class print_reverse_number {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 10899;
      while (n>0) {
        int lastDigit = n % 10;
        System.out.print(lastDigit + " ");
        n /= 10;
        
      }
      System.out.println();
    }
    
}
