package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class SaddlePoint {

    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };


        for (int i = 0; i < arr.length; i++) {
            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Saddle point is :" + arr[i][svj]);
                return;
            }
        }

        System.out.println("No Saddle point is found");
    }
}
