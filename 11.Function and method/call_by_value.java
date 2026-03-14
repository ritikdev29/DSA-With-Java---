import java.util.*;
 // object kai saath
    class student{
        int marks;
    }
    

    class call_by_value {
        static void change(student s) {
            s.marks = 95;
        }
    
    public static void main(String[] args) {
        student s1 = new student();
        s1.marks = 50;
        change(s1);
        System.out.println( "" + s1.marks);
       
        
    }
    
}
