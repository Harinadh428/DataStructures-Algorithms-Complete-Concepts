package main.arrays.sorting;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class MergeSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 9, 4, 2, 1, 8};
        mergeSort(arr);

        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
    }

    private static void mergeSort(int[] arr) {

        if(arr.length<2){return;}
        int middleIndex = arr.length / 2;

        int[] lhf = new int[middleIndex];
        int[] rhf = new int[arr.length - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            lhf[i] = arr[i];
        }

        for (int j = middleIndex; j < arr.length; j++) {
            rhf[j - middleIndex] = arr[j];
        }

        mergeSort(lhf);
        mergeSort(rhf);
        merge(arr, lhf, rhf);
    }

    private static void merge(int[] arr, int[] lhf, int[] rhf) {
        int i = 0;
        int j = 0;
        int k = 0;
        int lhfLength = lhf.length;
        int rhfLength = rhf.length;

        while (i < lhfLength && j < rhfLength) {
            if (lhf[i] < rhf[j]) {
                arr[k++] = lhf[i++];
            } else {
                arr[k++] = rhf[j++];
            }
        }

        while (i < lhfLength) {
            arr[k++] = lhf[i++];
        }

        while (j < rhfLength) {
            arr[k++] = rhf[j++];
        }
    }
}
