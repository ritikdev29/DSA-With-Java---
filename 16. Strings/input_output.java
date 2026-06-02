import java.util.*;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name;
        name = sc.next();

        System.out.println("Your name is : " + name); // this is not full name print ..

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your name for full Print : ");
        String hello;
        hello = sc1.nextLine(); // this function is all line executes in string..
        System.out.println("Your name is : " + hello);

    }

}
