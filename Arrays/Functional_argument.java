import java.util.*;

public class Functional_argument {
    public static void update(int marks[], int nonChnagable) {
        nonChnagable = 10;
        for (int i = 0; i < marks.length; i++) {
            // update(marks+1);
            marks[i] = marks[i] + 1; // har jagah marks ko update kar diya
        }

    }

    public static void main(String[] args) {
        int marks[] = new int[8];

        Scanner sc = new Scanner(System.in);
        // int marks[] = { 98, 99, 100 };
        int nonChnagable = 5;
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();

        update(marks,nonChnagable);
        System.out.println("changable value is : " + nonChnagable);   //  value chnage nhi hogi 
        // printt statemfn

        for (int i = 0; i < marks.length; i++) {
            // System.out.println(marks[i] + " ");
            System.out.println("Your marks update is : " + marks[i]);


        }
        System.out.println();
        // System.out.println("your marks update is : "+ marks[0]);
        // System.out.println("your marks update is : "+ marks[2]);
        // System.out.println("your marks update is : "+ marks[3]);
        // System.out.println("your marks update is : "+ marks[4]);
        // System.out.println("your marks update is : "+ marks[5]);
        // System.out.println("your marks update is : "+ marks[6]);



    }

}
