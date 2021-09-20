package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 4, 5, 6, 7, 7};
        int[] arr2 = {1, 2, 2, 2, 3, 4, 5, 7};

        int i = 0;
        int j = 0;
        int k = arr1.length;
        int l = arr2.length;

        int[] u = new int[k + l];
        int index = 0;

        while (i < arr1.length && j < arr2.length) {

            while ((i < arr1.length - 1) && (arr1[i] == arr1[i + 1])) {
                i++;
            }

            while ((j < arr2.length - 1) && (arr2[j] == arr2[j + 1])) {
                j++;
            }

            if (arr1[i] < arr2[j]) {
                u[index++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                u[index++] = arr2[j++];
            } else {
                u[index++] = arr1[i++];
                j++;
            }
        }

        for (int x : u) {
            System.out.print(x + " ");
        }

    }

}
