package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class WaveTraversal {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {8, 9, 0, 0}, {1, 2, 3, 4}};

        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int k = arr[i].length - 1; k >= 0; k--) {
                    System.out.print(arr[k][i] + " ");
                }
            }
        }
    }
}

