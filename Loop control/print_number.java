import java.util.*;

public class print_number {
    public static void main(String[] args) {
        // print number 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int range = sc.nextInt();
        int count = 1;

        while (count <= range) {
            System.out.print(count + " ");
            count++;
            
        }
        // System.out.println();
        System.out.println();
        {
           // while loops print square patterns
           int line = 1;
           while (line <= 4) {
            System.out.println("****");
            line++;
            
           }
        }
    }
    
}
