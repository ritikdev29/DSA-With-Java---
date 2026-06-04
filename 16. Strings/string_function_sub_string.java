// import java.util.*;
public class string_function_sub_string {

    // create a function ---->
    public static String subString(String str, int si, int ei) { // si = starting index,ei = ending index
        String substr = ""; // make new string --->
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(subString(str, 0,5)); // this is i call ---->
        System.out.println((str.substring(2, 5))); // java kai under pahley se substring function pahley se hota hai----

    }

}
