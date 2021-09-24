package main.arrays.patterns;

/**
 * @author harinadh dasari
 */
/*
        5 6 7 8 9
        5 6 7 8
        5 6 7
        5 6
        5
*/
public class Pattern4 {

    public static void main(String[] args) {

        for (int i = 9; i >= 5; i--) {
            for (int j = 5; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
