package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class FindMaxSumOfSUbArrayWithGivenSizeK {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 1};
        int k = 3;

        int sum = 0;
        int max_sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        max_sum = sum;
        int start = 0;
        for (int j = k; j < arr.length; j++) {
            sum = sum + arr[j] - arr[start++];

            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        System.out.println("Max sum :" + max_sum);
    }
}
