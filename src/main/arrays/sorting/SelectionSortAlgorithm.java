package main.arrays.sorting;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 1, -1, 8};
        selectionSort(arr);

        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
    }

    private static void selectionSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length - 1; j++) {

                if (arr[j] <= arr[min]) {
                    min = j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
