package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class ExitPointOfMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {1, 0, 1, 0}
        };

        int i = 0;
        int j = 0;
        int direction = 0;

        //0->east, 1->south, 2->west,3->north
        //     north
        //  ___  |  ____east
        //  west | south

        while (true) {
            direction = (direction + arr[i][j]) % 4;

            if (direction == 0) { //east
                j++;
            } else if (direction == 1) { //south
                i++;
            } else if (direction == 2) { //west
                j--;
            } else if (direction == 3) { //north
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }

        System.out.println(i + ", " + j);
    }

}
