package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class DifferenceOfTwoArrays {

    public static void main(String[] args) {
        int[] arr2 = {3, 3, 3, 3, 3, 3};
        int[] arr1 = {9, 9, 9, 9, 9};

        int[] diff = new int[arr1.length > arr2.length ? arr1.length : arr2.length];

        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int digit = 0;
            int aVal = i >= 0 ? arr1[i] : 0;
          //  System.out.println(j);
            if (arr2[j] + carry >=aVal) {
                digit = arr2[j] + carry - aVal;
                carry = 0;
            } else {
                digit = arr2[j] + carry + 10 - aVal;
                carry = -1;
            }
            diff[k] = digit;
            i--;
            j--;
            k--;
        }

        int idx = 0;

        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while (idx < diff.length) {
            System.out.print(diff[idx] + " ");
            idx++;
        }
    }
}
