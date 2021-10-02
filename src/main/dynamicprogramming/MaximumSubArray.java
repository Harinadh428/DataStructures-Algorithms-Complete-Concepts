package main.dynamicprogramming;

/**
 * @author harinadh dasari
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, -1};
        //kadane's algorithm
        int startIndex = 0;
        int endIndex = 0;
        int currentSum = arr[0];
        int overAllSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentSum >= 0) {
                currentSum += arr[i];
            } else {
                currentSum = arr[i];
            }
            if (currentSum > overAllSum) {
                overAllSum = currentSum;
            }
        }

        System.out.println(overAllSum);
    }
}
