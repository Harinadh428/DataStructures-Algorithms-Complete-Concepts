package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}};

        int minColumn = 0;
        int maxColumn = arr[0].length - 1;

        int minRow = 0;
        int maxRow = arr.length;

        int max = arr[0].length * 4;
        int count = 0;
        System.out.println("Spiral Traversal");
        while (count < max) {
            //left wall
            for (int i = minRow, j = minColumn; i < maxRow; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minColumn++;

            //bottom wall

            for (int i = minColumn, j = maxRow - 1; i <= maxColumn; i++) {
                System.out.print(arr[j][i] + " ");
                count++;
            }
            maxRow--;

            //right wall

            for (int i = maxRow - 1, j = maxColumn; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxColumn--;

            //top wall
            for (int i = maxColumn, j = minRow; i >= minColumn; i--) {
                System.out.print(arr[j][i] + " ");
                count++;
            }
            minRow++;
        }
    }
}
