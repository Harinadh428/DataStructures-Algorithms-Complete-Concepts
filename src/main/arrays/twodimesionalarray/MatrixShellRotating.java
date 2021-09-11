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

        int s = 3;
        int r = 3;
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
        int[] oneD = fillOneDFromShell(arr, s);
        rotateOneD(oneD, r);
        fillShellFromOneD(arr, s, oneD);
    }

    private static void fillShellFromOneD(int[][] arr, int s, int[] oneD) {

        int minRow = s - 1;
        int minColumn = s - 1;
        int maxRow = arr.length - s;
        int maxColumn = arr[0].length - s;

        int index = 0;

        //lw
        for (int i = minRow, j = minColumn; i <= maxRow; i++) {
            arr[i][j] = oneD[index];
            index++;
        }
        //bw
        for (int i = maxRow, j = minColumn + 1; j <= maxColumn; j++) {
            arr[i][j] = oneD[index];
            index++;
        }
        //lw
        for (int i = maxRow - 1, j = maxColumn; i >= minRow; i--) {
            arr[i][j] = oneD[index];
            index++;
        }
        //tw

        for (int i = minRow, j = maxColumn - 1; j >= minColumn + 1; j--) {
            arr[i][j] = oneD[index];
            index++;
        }
    }

    private static void rotateOneD(int[] oneD, int r) {
        r = r % oneD.length;

        while (r < 0) {
            r = r + oneD.length;
        }
        reverse(oneD, 0, oneD.length - r - 1);
        reverse(oneD, oneD.length - r, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);
    }

    private static void reverse(int[] oneD, int startIndex, int endIndex) {

        while (startIndex < endIndex) {
            int temp = oneD[startIndex];
            oneD[startIndex] = oneD[endIndex];
            oneD[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private static int[] fillOneDFromShell(int[][] arr, int s) {
        int minRow = s - 1;
        int minColumn = s - 1;
        int maxRow = arr.length - s;
        int maxColumn = arr[0].length - s;
        int size = 2 * (maxRow - minRow + maxColumn - minColumn);

        int[] oneD = new int[size];
        int index = 0;

        //rw
        for (int i = minRow, j = minColumn; i < maxRow; i++) {
            oneD[index] = arr[i][j];
            index++;
        }
        //bw
        for (int i = maxRow, j = minColumn + 1; j <= maxColumn; j++) {
            oneD[index] = arr[i][j];
            index++;
        }
        //lw
        for (int i = maxRow - 1, j = maxColumn; i >= minRow; i--) {
            oneD[index] = arr[i][j];
            index++;
        }
        //tw

        for (int i = minRow, j = maxColumn - 1; j >= minColumn + 1; j--) {
            oneD[index] = arr[i][j];
            index++;
        }
        return oneD;
    }
}
