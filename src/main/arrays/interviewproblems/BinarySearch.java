package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 41, 43, 50, 65};
        int targetElement = 40;
        searchTheKey(arr, targetElement, 0, arr.length - 1);
    }

    private static void searchTheKey(int[] arr, int targetElement, int startIndex, int endIndex) {

        if (arr.length > 2 && startIndex > endIndex) { // why we need this condition startIdx>endIndex because some times what will happen if value dosen't exist
            // then we will keep on decreasing the endidx some point it will go negetive even though out start idx is 0
            // but in general end idx will never go to -1
            // that's why we have added this condition
            System.out.println(-1);
        }
        int midIndex = (startIndex + endIndex) / 2;

        if (targetElement == arr[midIndex]) {
            System.out.println("Item Exist at Index :" + midIndex);
            return;
        }

        if (targetElement < arr[midIndex]) {
            searchTheKey(arr, targetElement, startIndex, midIndex - 1);
        }
        if (targetElement > arr[midIndex]) {
            searchTheKey(arr, targetElement, midIndex + 1, endIndex);
        }
    }
}
