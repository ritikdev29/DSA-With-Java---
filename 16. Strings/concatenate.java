import java.util.*;
public class concatenate {
    public static void printLetter(String str) {
        for(int i = 0;i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }

    }
    public static void main(String[] args) {
        String firsname = "Ritik";
        String lasname  = "Kumar Gupta";
        String fullname = firsname +" "+ lasname; // cancatination rule follw
        System.out.println(fullname);
        printLetter(fullname);
    }
    
}
