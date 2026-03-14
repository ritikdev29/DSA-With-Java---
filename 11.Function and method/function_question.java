import java.util.Scanner;
public class function_question {
    public static void avg(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        float x = sc.nextFloat();
        System.out.print("inout second Nimber : ");
        float y = sc.nextFloat();
        System.out.print("input third number : ");
        float z = sc.nextFloat();

        System.out.println("The average value is " + average(x,y,z)+ "\n");
        

    }
    public static double average(float x,float y,float z) {
        return (x + y + z) / 3;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int result = (a+b+c)/3;
        System.out.println("Your average sum is : " + result);
        avg();

        // System.out.print("Input first number : ");
        // double x = sc.nextDouble();
        // System.out.print("inout second Nimber : ");
        // double y = sc.nextDouble();
        // System.out.print("input third number : ");
        // double z = sc.nextDouble();

        // System.out.println("The average value is " + average(x,y,z)+ "\n");
        

        
    }
    // public static double average(double x,double y,double z) {
    //     return (x + y + z) / 3;
    // }
    
}