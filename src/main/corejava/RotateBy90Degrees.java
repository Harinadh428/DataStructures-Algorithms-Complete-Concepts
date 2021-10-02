package main.corejava;

/**
 * @author harinadh dasari
 */
public class RotateBy90Degrees {

    public static void main(String[] args) {
        String[][] arr = {
                {"a", "b", "c", "d"},
                {"e", "f", "g", "h"},
                {"i", "j", "k", "l"},
                {"m", "n", "o", "p"},
        };

        //transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                String temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Reverse the Matrix
        for (int i = 0; i < arr.length; i++) {
            int leftIndex = 0;
            int rightIndex = arr.length - 1;

            while (leftIndex < rightIndex) {
                String temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }

        //display array data

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
