package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class BarChart {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            int min = 0;

            while (min <= arr[i]) {
                System.out.print("*");
                min++;
            }
            System.out.println("\t");
        }
    }
}
