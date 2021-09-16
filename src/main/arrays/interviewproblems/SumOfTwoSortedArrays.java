package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class SumOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {9, 3, 4, 6, 8};
        int[] arr2 = {1, 9, 8, 8};

        int[] sum = new int[arr1.length > arr2.length ? arr1.length : arr2.length];

        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int digit = carry;

            if (i >= 0) {
                digit += arr1[i];
            }
            if (j >= 0) {
                digit += arr2[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            sum[k] = digit;
            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.print(carry + " ");
        }
        for (int val : sum) {
            System.out.print(val + " ");
        }
    }
}
