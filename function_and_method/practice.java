public class practice {
    public static void hello(int a, int b) {
        int temp = a;
        a = b;
        b =temp;
        System.out.println("a id is : " + a);
        System.out.println("b id is : " + b);

    }
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        // System.out.println();
        hello(a,b);

        
    }
}
