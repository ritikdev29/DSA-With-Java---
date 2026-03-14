import java.util.*;
public class swaping {
    public static void swap(int a, int b){
        int tem = a;
        a =b;
        b=tem;
        System.out.println("A="+a);
        System.out.println("B="+b);

    }
    // call by value find product
    public static int multiply(int r,int k) {
        int product = r*k;
        return product;
    }
    

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);

        int r = 3;
        int k = 6;
        int pro = multiply(r, k);
        System.out.println("A*b is : " + pro);
        
    }
}