import java.util.*;

public class Reverse_arrays {
    public static void reverse(int numbers[]) {
        // this function is work for array revese karna--->>>>
        int first = 0, last = numbers.length - 1;

        while (first <= last) {  // (first <= last) yaha <= isliye nhi likha ki first bhi wahi hota and last bhi wahi hota--->>> so no need = conditions....
            // swap the values
            int tem = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = tem; // swaping kai liye classical code hota hai ye sab tem to tem----->

            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7, 8, 10 };
        reverse(numbers);

        //print for the arrays...---->
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

}
