public class type_casting {
    public static void main(String[] args) {
        // i use chr to int 
        char grade = 'a';
        int num = grade;
        System.out.println("Your char to int values is :" + num);
        char grade2 = 'B';
        int num2 = grade2;
        System.out.println("Your char to int values is :" + num2);

        // float to int
        float rk = 50.9999f; // .99999 this is not rounduoff3
        int a = (int) rk;
        System.out.println("value is : "+ a);

        
    }
    
}
