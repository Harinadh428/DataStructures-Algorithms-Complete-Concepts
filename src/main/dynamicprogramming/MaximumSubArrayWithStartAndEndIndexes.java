package main.dynamicprogramming;

/**
 * @author harinadh dasari
 */
public class MaximumSubArrayWithStartAndEndIndexes {

    public static void main(String[] args) {
        int[] arr = {1, 2, -5, 3, 6};
        findLargestSubArrayIndexes(arr);
    }

    private static void findLargestSubArrayIndexes(int[] arr) {
        int currentBest = arr[0];
        int overAllBest = arr[0];

        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentBest + arr[i]) {
                currentBest = arr[i];
                s = i;
            } else {
                currentBest = currentBest + arr[i];
            }

            if (currentBest > overAllBest) {
                overAllBest = currentBest;
                start = s;
                end = i;
            }
        }

        System.out.println("start and end index " + start + " , " + end);
    }
}
