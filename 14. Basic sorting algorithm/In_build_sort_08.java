
import java.util.Arrays;
public class In_build_sort_08 {
    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {      //// time .c = O(n^2);
            int cuurent = arr[i];         // temporary memory make 
            int prev = i - 1;            // current ka previous element
            // finding out currect position to insert--->
            while (prev >= 0 && arr[prev] > cuurent) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            // insertion
            arr[prev + 1] = cuurent;
        }
    }

    // array print ----> code
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // insertion_sort(arr);
         Arrays.sort(arr,0,3); // out = 1 4 5 3 2 --->
        //Arrays.sort(arr);  // out = 1 2 3 4 5
        printArr(arr);
        System.out.println("thank you >>>");

    }

}
