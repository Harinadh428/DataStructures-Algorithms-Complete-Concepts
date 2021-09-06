package main.arrays.sorting;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 0, 1, 8};

        bubbleSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }

    private static void bubbleSort(int[] arr) {

        if (arr.length < 2) {
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
