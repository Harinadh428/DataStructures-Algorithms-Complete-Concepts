package main.arrays.interviewproblems;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class FindDuplicatesInArrayWithOneIteration {
    static int[] arr = {2, 4, 1, 4, 1, 3, 2};

    public static void main(String[] args) {
        int[] tempArr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            if (tempArr[arr[i]] == 0) {
                tempArr[arr[i]] = 1;
            } else {
                System.out.print(arr[i] + " ");
            }
        }

      //  Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
    }
}
