package main.arrays.interviewproblems;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class MaxMultiplicationOfTwoNumbersInArray {

    public static void main(String[] args) {
        int[] arr = {-4, 7, 1, 3, 7, 2};

        // approach1(arr); //t.c O(n n^2) s.c O(1)
        // approach2(arr); //t.c O(nlogn) we are using quick sort  and s.c O(1)
        approach3(arr);

    }

    private static void approach3(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        if (arr.length == 2) {
            int max_multi = arr[0] * arr[1];

        }

        int min = arr[0] < arr[1] ? arr[0] : arr[1];
        int second_min = arr[0] > arr[1] ? arr[0] : arr[1];

        int max = arr[0] > arr[1] ? arr[0] : arr[1];
        int second_max = arr[0] < arr[1] ? arr[0] : arr[1];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                second_min = min;
                min = arr[i];
            } else if (arr[i] < second_min) {
                second_min = arr[i];
            }

            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max) {
                second_max = arr[i];
            }
        }

        int max1 = min * second_min;
        int max2 = max * second_max;
        if (max1 > max2) {
            System.out.println("Max multiplication of two numbers in array :" + max1);
        } else {
            System.out.println("Max multiplication of two numbers in array :" + max2);
        }

    }

    private static void approach2(int[] arr) {
        //sort the array
        quickSort(arr, 0, arr.length - 1);
        int max_multi1 = arr[0] * arr[1];
        int max_multi2 = arr[arr.length - 1] * arr[arr.length - 2];

        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        System.out.println();

        if (max_multi1 > max_multi2) {
            System.out.println("Max multiplication of two numbers in array :" + max_multi1);
        } else {
            System.out.println("Max multiplication of two numbers in array :" + max_multi2);
        }

    }

    private static void quickSort(int[] arr, int startIdx, int endIdx) {

        if (startIdx < endIdx) {
            int partIdx = partition(arr, startIdx, endIdx);
            quickSort(arr, startIdx, partIdx - 1);
            quickSort(arr, partIdx + 1, endIdx);
        }
    }

    private static int partition(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[endIdx];
        int i = startIdx - 1;

        for (int j = startIdx; j < endIdx; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[endIdx];
        arr[endIdx] = temp;
        return i + 1;
    }


    private static void approach1(int[] arr) {

        int max_multi = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (max_multi < arr[i] * arr[j]) {
                    max_multi = arr[i] * arr[j];
                }
            }
        }

        System.out.println("Max multiplication of two numbers in array :" + max_multi);
    }
}
