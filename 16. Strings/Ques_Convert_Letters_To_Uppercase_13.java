import java.util.Scanner;
public class Ques_Convert_Letters_To_Uppercase_13 {
    public static String toUpperCase(String str) {
         StringBuilder sb = new StringBuilder(""); // intitialized empty word --->
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i =1;i<str.length();i++){  // zero ko upar dekh liya hai is liye 1 se start krege --->
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));  // empty space ho jayega to sb mai append kar denge
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            } else{
                sb.append(str.charAt(i));
            }
        }
     return sb.toString(); 
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lower case full name to conver upper case : ");

        String str = sc.nextLine();
        
    
        // String str = "hi, i am ritik kumar";

        System.out.println(toUpperCase(str));

        // linear time problem solve..
       
    }
    
}
