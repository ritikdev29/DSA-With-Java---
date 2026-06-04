import java.util.*;
public class insertion_sort_07 {
    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cuurent = arr[i];
            int prev = i - 1;
            // finding out currect position to insert--->
            while (prev >= 0 && arr[prev] > arr[cuurent]) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            // insertion
            arr[prev + 1] = arr[cuurent];
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
        insertion_sort(arr);
        printArr(arr);

    }

}
