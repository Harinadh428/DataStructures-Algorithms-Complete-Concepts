package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 7, 2, 4, 6, -10};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
