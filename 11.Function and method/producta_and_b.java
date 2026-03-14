public class producta_and_b {
    public static int multiply (int a, int b) {
        int product = a * b;
        return product;
    }
    public static double add(double a, double b){
        double ad = a-b;
        return ad;
    }
    public static double divide (double a, double b) {
        double di = a / b;
        return di;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int pro = multiply(a, b);
        // int pro = multiply(2, 4);
        System.out.println("Produc is a * b=" + pro);
        pro = multiply(10, 20);
        System.out.println("Product is a * b = " + pro);


        double hel = add(1.0, 8.0);
        System.out.println("Subtract is : " + hel);
        double di = divide(2, 4);
        System.out.println("Divivde is : " + di);
        
    }
    
}
