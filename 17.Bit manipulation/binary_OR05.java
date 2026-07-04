public class binary_OR05 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // or operator
        int result = a | b;
        System.out.println("A binary  : " + Integer.toBinaryString(a));
        System.out.println("B binary  : " + Integer.toBinaryString(b));

        System.out.println("Result Binary  : " + Integer.toBinaryString(result));
        System.out.println("Result Decimal  : " + result);

        System.out.println("Your OR Operator values is : " + (5 | 6));
    }

}
