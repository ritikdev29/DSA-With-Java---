import java.util.Scanner;

// with method
class student {
    int rool;
    String name;

    void details() {
        System.out.println(rool + " " + name);
    }
}

public class method_scope21 {
    static void show() {
        int x = 10;
        System.out.println("Your value is : " + x);
    }

    static void m1() {
        int x = 20;
        int y = 30;
        int result = x + y;
        System.out.println("Your sum is : " + result);
    }

    static void m2() {
        double x = 4.4;
        double y = 40.6;
        double s = x + y;
        System.out.println("Double sum is : " + s);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.rool = 101;
        s1.name = " Hello world...";
        s1.details();
        show();
        m1();
        m2();

        // System.out.println(x); not allowed
    }

}
