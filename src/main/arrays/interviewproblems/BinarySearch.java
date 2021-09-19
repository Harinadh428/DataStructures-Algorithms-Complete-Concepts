package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 41, 43, 50, 65};
        int targetElement = 41;
        searchTheKey(arr, targetElement, 0, arr.length - 1);
    }

    private static void searchTheKey(int[] arr, int targetElement, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;

            if (targetElement == arr[midIndex]) {
                System.out.println("Item Exist at Index :" + midIndex);
                return;
            }

            if (targetElement < arr[midIndex]) {
                searchTheKey(arr, targetElement, startIndex, midIndex - 1);
            }
            if (targetElement > arr[midIndex]) {
                searchTheKey(arr, targetElement, midIndex+1, endIndex);
            }
        }
    }
}
