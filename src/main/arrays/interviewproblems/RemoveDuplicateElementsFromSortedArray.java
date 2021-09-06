package main.arrays.interviewproblems;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class RemoveDuplicateElementsFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 4};
        System.out.println("With Duplicates");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        int[] noDuplicateElementsArray = removeDuplicates(arr);
        System.out.println();
        System.out.println("Without Duplicates");
        Arrays.stream(noDuplicateElementsArray).forEach(e -> System.out.print(e + " "));
    }

    private static int[] removeDuplicates(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                arr[++i] = arr[j++];
            }
        }
        int[] noDuplicates = new int[i + 1];

        for (int x = 0; x < noDuplicates.length; x++) {
            noDuplicates[x] = arr[x];
        }
        return noDuplicates;
    }
}
