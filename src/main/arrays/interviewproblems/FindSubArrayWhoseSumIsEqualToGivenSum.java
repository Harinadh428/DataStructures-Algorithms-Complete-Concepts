package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class FindSubArrayWhoseSumIsEqualToGivenSum {

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1, 8};
        int targetSum = 9;
        //This is brute force approach where time complexity is O(n^2)
        //Space complexity is O(1)
        //approach1(arr, targetSum);
    }

    private static void approach1(int[] arr, int targetSum) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == targetSum) {
                    System.out.println("Target Sum with Indexes :" + i + ", " + j);
                    return;
                } else if (sum >= targetSum) {
                    break;
                }
            }
        }
    }
}
