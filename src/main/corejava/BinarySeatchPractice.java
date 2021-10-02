package main.corejava;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class BinarySeatchPractice {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 23, 4, 33, 5};

        System.out.println(binarySearch(arr, 4, 0, arr.length - 1));
    }

    private static boolean binarySearch(int[] arr, int target, int start, int end) {
        Arrays.sort(arr);
        if (start > end) {
            return false;
        }

        int mid = (start + end) / 2;

        if (target == arr[mid]) {
            return true;
        }

        if (target > arr[mid]) {
            binarySearch(arr, target, start, mid - 1);
        } else {
            binarySearch(arr, target, mid + 1, end);
        }

        return false;
    }
}
