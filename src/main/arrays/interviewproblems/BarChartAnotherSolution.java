package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class BarChartAnotherSolution {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2, 8};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int maxHeight = max; maxHeight >= 1; maxHeight--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= maxHeight) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
