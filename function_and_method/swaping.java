public class swaping {
    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }

    public static void hello(int r, int k) {
        int temp = r;
        r = k;
        k = temp;

    }

    public static void main(String[] args) {
        // swap values exchange
        int a = 5;
        int b = 10;
        swap(a, b);
        // ye dono value print karana chahu upar ka coment ka du to actual value print
        // hoga

        // System.out.println("A = " + a);
        // System.out.println("B = " + b);
        int r = 12;
        int k = 30;
        hello(r, k);
        System.out.println("R = " + r);
        System.out.println("K = " + k);

    }
}
