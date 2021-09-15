package main.arrays.twodimesionalarray;

import java.sql.SQLOutput;

/**
 * @author harinadh dasari
 */
public class SearchIn2dArray {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
                {40, 41, 42, 43, 44},
                {50, 51, 52, 53, 54}
        };

        int x = 50;
        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {
            if (x == arr[i][j]) {
                System.out.println("Element Found in : [ " + i + "," + j + " ]");
                return;
            } else if (x > arr[i][j]) {
                i++;
            } else if (x < arr[i][j]) {
                j--;
            }

        }
        System.out.println("Element doesn't exist on the Array");
    }
}
