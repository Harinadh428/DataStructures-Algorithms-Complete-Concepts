package main.corejava;

/**
 * @author harinadh dasari
 */
public class SpiralTraversalPractice {

    public static void main(String[] args) {
        int[][] arr =
                {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        int minC = 0;
        int minR = 0;
        int maxC = arr[0].length - 1;
        int maxR = arr.length - 1;
        int max = arr.length * 4;
        int count = 0;

        while (count < max) {
            //lw
            for (int i = minR, j = minC; i <= maxR; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minC++;

            //bw
            for (int i = maxR, j = minC; j <= maxC; j++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxR--;

            //rw
            for (int i = maxR, j = maxC; i >= minR; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxC--;

            //tw
            for (int i = minR, j = maxC; j >= minC; j--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minR++;
        }
    }
}
