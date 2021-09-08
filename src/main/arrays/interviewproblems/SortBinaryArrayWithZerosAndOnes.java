package main.arrays.interviewproblems;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class SortBinaryArrayWithZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 0, 1};
        //Solution1
        /*for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/
        int i = 0;
        int j = arr.length-1;

        while (i < j) {
            if (arr[i] > arr[j]) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            } else if (arr[i] == 0 && arr[j] == 0) {
                i++;
            } else if (arr[i] == 1 && arr[j] == 1) {
                j--;
            } else if (arr[i] < arr[j]) {
                i++;
                j--;
            }

        }
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }
}
