import java.util.*;

public class Max_Subarray_Sum {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) { // print
                    // subarrays sum
                    currSum += numbers[k];
   // Time complexity is : O(n)3 or cube , because three loop using and very bad time complexity...---->
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;

                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        //int numbers[] = { 2, 4, 6, 8, 10 }; // max vslue is : 30
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }

}
