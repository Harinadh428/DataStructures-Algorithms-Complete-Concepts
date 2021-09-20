package main.arrays.interviewproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author harinadh dasari
 */
public class MultiplicationOfTwoNumbersMatchesGivenValue {

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 10, 7, 5, 8};
        int val = 15;

        //approach 1 brute force approach
        //   approach1(arr, val);
        // approach2(arr, val);
        approach3(arr, val);
    }

    private static void approach3(int[] arr, int val) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if ((val % arr[i] == 0) && (set.contains(val/arr[i]))) {
                System.out.println("Sum of two numbers will get the required sum ");
                return;
            } else {
                set.add(arr[i]);
            }
        }
    }

    private static void approach2(int[] arr, int val) {

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int result = arr[i] * arr[j];
            if (result == val) {
                System.out.println("Sum of two numbers will get the required sum " + i + " , " + j);
                break;
            }
            if (result > val) {
                j--;
            } else {
                i++;
            }
        }
    }

    private static void approach1(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int result = arr[i] * arr[j];

                if (result == val) {
                    System.out.println("Sum of two numbers will get the required sum " + i + " , " + j);
                }
            }
        }
    }
}
