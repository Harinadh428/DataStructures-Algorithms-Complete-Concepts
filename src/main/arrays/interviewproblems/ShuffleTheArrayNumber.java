package main.arrays.interviewproblems;

import java.util.Random;

/**
 * @author harinadh dasari
 */
public class ShuffleTheArrayNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13};
        for (int i = 0; i < 4; i++) {
            shuffle(arr);
            System.out.println();
        }

    }

    private static void shuffle(int[] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomVal = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomVal];
            arr[randomVal] = temp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
