package main.corejava;

/**
 * @author harinadh dasari
 */
public class ExitPointOfMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 0, 1, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {1, 0, 0, 1}};

        int i = 0;
        int j = 0;
        int dir = 0;

        while (true) {
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) {
                j++;
            }
            if (dir == 1) {
                i++;
            }
            if (dir == 2) {
                j--;
            }
            if (dir == 3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            }
            if (j < 0) {
                j++;
                break;
            }
            if (i == arr.length) {
                i--;
                break;
            }
            if (j == arr.length) {
                j--;
                break;
            }
        }
        System.out.println(i + "--------" + j);
    }
}
