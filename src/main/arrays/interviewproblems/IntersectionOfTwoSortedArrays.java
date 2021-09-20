package main.arrays.interviewproblems;

import java.util.ArrayList;

/**
 * @author harinadh dasari
 */
//Intersection means duplicate elements or common elements between the two arrays
public class IntersectionOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 2, 3, 3, 4, 7, 8};
        int[] arr2 = {1, 2, 4, 4, 6, 6, 7, 8, 10};

        ArrayList<Integer> al = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            while ((i < arr1.length - 1) && (arr1[i] == arr1[i + 1])) {
                i++;
            }
            while ((j < arr2.length - 1) && (arr2[j] == arr2[j + 1])) {
                j++;
            }
            if (arr1[i] == arr2[j]) {
                al.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            }

        }

        for (int x : al) {
            System.out.print(x + " ");
        }
    }
}
