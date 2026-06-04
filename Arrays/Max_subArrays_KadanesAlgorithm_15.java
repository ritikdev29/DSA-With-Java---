import java.util.*;

public class Max_subArrays_KadanesAlgorithm_15 {
    public static void kadens(int numbers[]) {
        int maximum_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            current_sum = current_sum + numbers[i];
            if (current_sum < 0) {
                current_sum = 0;

            }
            maximum_sum = Math.max(current_sum, maximum_sum);
        }
        System.out.println("our max subarray sum is : " + maximum_sum);
    }

    public static void main(String[] args) {
        // int numbers [] = {-2,-3,4,-1,-2,1,5,-3};
        // int numbers [] = {-3,4,6,-4,8,-6}; // -- ans = 14
        // int numbers [] = {-8,10,20,-3,-10,7,-3};// ans = 30
        int numbers[] = { 7, -3, 8, 10, -3, -10, 2, 8, -10 }; // ans= 22
        kadens(numbers);

    }

}
