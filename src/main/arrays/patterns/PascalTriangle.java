package main.arrays.patterns;

/**
 * @author harinadh dasari
 */
public class PascalTriangle {

    public static void main(String[] args) {
        int nextNo;

        for (int i = 0; i < 5; i++) {
            nextNo = 1;

            for (int k = 0; k < (5 - i) * 2; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", nextNo);
                nextNo = nextNo * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
