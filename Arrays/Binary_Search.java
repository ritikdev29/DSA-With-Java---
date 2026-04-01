import java.util.*;

public class Binary_Search {
    public static int binary_Search(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisons
            if (numbers[mid] == key) {// Found --->
                return mid;
                
            }
            if (numbers[mid]<key) { // for right <----
                start = mid+1;
            }
            else{
                end = mid -1;  // for left >---
            }
            

        }
        return -1;
        
    }

    public static void main(String[] args) {
        int numbers [] = {2,3,45,66,10,4,8,9,10};
        //int key = 1; // agar array mai key presant n ho tab output -1 aata hai because -1 means not exist in array ----->>> index value is : -1
        int key = 10;
        System.out.println("index value is : " + binary_Search(numbers,key));

    }
}
