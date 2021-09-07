package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class FIndTwoMaxNumbersInArrayWithOneIteration {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 7, 5};
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }

        System.out.println("Max 1 :" + max1);
        System.out.println("Max 2 :" + max2);
    }
}
