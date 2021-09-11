package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class Rotate90Degrees {

    public static void main(String[] args) {
        String[][] arr = {
                {"a", "b", "c", "d"},
                {"e", "f", "g", "h"},
                {"i", "j", "k", "l"},
                {"m", "n", "o", "p"}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //Step 1 Transpose the Matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                String temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Harinadh");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Reverse each each row from end to beginning
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length - 1;

            while (li < ri) {
                String temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                ri--;
                li++;

            }
        }
        System.out.println("After Rotating Matrix ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
