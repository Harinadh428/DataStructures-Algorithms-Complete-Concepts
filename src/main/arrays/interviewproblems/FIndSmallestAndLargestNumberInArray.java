package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class FIndSmallestAndLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 1, 3, 7, 9};
        int smallestElement = arr[0];
        int largestElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (smallestElement > arr[i]) {
                smallestElement = arr[i];
            } else if (largestElement < arr[i]) {
                largestElement = arr[i];
            }
        }

        System.out.println("Largest Element :" + largestElement);
        System.out.println("Smallest Element :" + smallestElement);
    }
}
