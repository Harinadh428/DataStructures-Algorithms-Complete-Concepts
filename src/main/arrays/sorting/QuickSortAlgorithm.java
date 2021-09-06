package main.arrays.sorting;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 0, 1, 8, -2, 1};
        quickSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int partitionIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, endIndex);
        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = (startIndex - 1);

        for (int j = startIndex; j < endIndex; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[endIndex];
        arr[endIndex] = temp;
        return i + 1;
    }
}
