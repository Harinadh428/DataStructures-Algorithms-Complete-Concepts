package main.arrays.interviewproblems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author harinadh dasari
 */
public class UnionOfTwoUnSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 1, 3, 5};
        int[] arr2 = {3, 2, 5, 2, 1, 4, 6, 8};

        Set<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length) {
            set.add(arr1[i++]);
        }
        while (j < arr2.length) {
            set.add(arr2[j++]);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
