import java.util.*;

public class Binary_Complement_07 {
    public static void main(String[] args) {
        System.out.println((~5));

        // use string methods
        String binary = "1011001";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                result.append('1');

            } else {
                result.append('0');
            }

        }
        System.out.println("Original Binary :" + binary);
        System.out.println("1`s complement : " + result);

        // output Original Binary :1011001
        // 1`s complement : 0100110

    }

}