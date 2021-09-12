package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 55, 65, 75, 85, 96},
                {77, 80, 90, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36},
        };

        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j < arr.length; i++, j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
