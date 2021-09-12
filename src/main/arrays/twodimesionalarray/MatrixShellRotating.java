package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class MatrixShellRotating {

    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };

        System.out.println();

        int s = 1;
        int r = 5;
        rotateShell(arr, s, r);
        display(arr);
    }

    private static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateShell(int[][] arr, int s, int r) {
        int[] oneDArray = fillOneDArrayFromShell(arr, s);
        rotateOneDArray(oneDArray, r);
        fillShellFromOneDArray(arr, s, oneDArray);
    }

    private static void fillShellFromOneDArray(int[][] arr, int s, int[] oneDArray) {

        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = arr.length - s;
        int maxCol = arr[0].length - s;
        int index = 0;

        //left wall
        for (int i = minRow, j = minCol; i <= maxRow; i++) {
            arr[i][j] = oneDArray[index];
            index++;
        }
        //bottom wall
        for (int i = maxRow, j = minCol + 1; j <= maxCol; j++) {
            arr[i][j] = oneDArray[index];
            index++;
        }
        //right wall
        for (int i = maxRow - 1, j = maxCol; i >= minRow; i--) {
            arr[i][j] = oneDArray[index];
            index++;
        }
        //top wall

        for (int i = minRow, j = maxCol - 1; j >= minCol + 1; j--) {
            arr[i][j] = oneDArray[index];
            index++;
        }

    }

    private static void rotateOneDArray(int[] oneDArray, int r) {
        int startIndex = 0;
        int endIndex = oneDArray.length - 1;
        //reverse part1
        reverse(oneDArray, startIndex, oneDArray.length - r - 1);
        //reverse part2
        reverse(oneDArray, oneDArray.length - r, oneDArray.length-1);
        //reverse whole array
        reverse(oneDArray, startIndex, oneDArray.length - 1);
    }

    private static void reverse(int[] oneDArray, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = oneDArray[startIndex];
            oneDArray[startIndex] = oneDArray[endIndex];
            oneDArray[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private static int[] fillOneDArrayFromShell(int[][] arr, int s) {

        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = arr.length - s;
        int maxCol = arr[0].length - s;
        int oneDArraySize = 2 * (maxRow - minRow + maxCol - minCol);

        int[] oneDArray = new int[oneDArraySize];
        int index = 0;

        //left wall
        for (int i = minRow, j = minCol; i <= maxRow; i++) {
            oneDArray[index] = arr[i][j];
            index++;
        }
        //bottom wall
        for (int i = maxRow, j = minCol + 1; j <= maxCol; j++) {
            oneDArray[index] = arr[i][j];
            index++;
        }
        //right wall
        for (int i = maxRow - 1, j = maxCol; i >= minRow; i--) {
            oneDArray[index] = arr[i][j];
            index++;
        }
        //top wall

        for (int i = minRow, j = maxCol - 1; j >= minCol + 1; j--) {
            oneDArray[index] = arr[i][j];
            index++;
        }
        return oneDArray;
    }

}
