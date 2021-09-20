package main.arrays.interviewproblems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author harinadh dasari
 */
public class IntersectionOfTwoUnsortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 5, 3, 1, 5, 3};
        int[] arr2 = {5, 2, 1, 3, 3, 5, 4, 8, 10};
        Set<Integer> set = new HashSet<>();
        Set<Integer> finalSet = new HashSet<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length) {
            set.add(arr1[i++]);
        }

        while (j < arr2.length) {
            if (set.contains(arr2[j])) {
                finalSet.add(arr2[j++]);
            } else {
                j++;
            }
        }
        for (int x : finalSet) {
            System.out.print(x + " ");
        }
    }
}
