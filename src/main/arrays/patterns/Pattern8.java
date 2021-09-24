package main.arrays.patterns;

/**
 * @author harinadh dasari
 */

/*      *
        * *
        * * *
        * * * *
        * * * *
        * * *
        * *
        **/
public class Pattern8 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                if (i == 4 && j == 4) {
                    System.out.println();
                    for (int k = 4; k >= 1; k--) {
                        for (int l = 1; l <= k; l++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }
    }
}
