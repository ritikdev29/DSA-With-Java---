public class test {
    // primitive data type se huaa hai
    static void change(int x) {
        x = 100;
        System.out.println("Inside method:" + x);

    }
   
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println("Outside method: " + a);
        
    }
    
}
