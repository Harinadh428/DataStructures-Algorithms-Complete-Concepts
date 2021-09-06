package main.arrays.sorting;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class InsertionSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 3, 4, 0, -1};
        insertionSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }

    private static void insertionSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int markedElement = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= markedElement) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = markedElement;
        }
    }
}
