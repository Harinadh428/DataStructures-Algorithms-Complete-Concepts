package main.corejava;

/**
 * @author harinadh dasari
 */
public class SpiralTraversal {

    public static void main(String[] args) {
        String[][] m1 = {{"a", "b", "c", "d"},
                {"e", "f", "g", "h"},
                {"i", "j", "k", "l"},
                {"m", "n", "o", "p"}};

        int count = 0;
        int max = m1.length * 4;

        int minC = 0;
        int maxC = m1[0].length-1;

        int maxR = m1.length-1;
        int minR = 0;

        while (count < max) {

            //lw
            for (int i = minR, j = minC; i <= maxR; i++) {
                System.out.print(m1[i][j] + " ");
                count++;
            }
            minC++;

            //bw
            for (int i = maxR, j = minC; j <= maxC; j++) {
                System.out.print(m1[i][j] + " ");
                count++;
            }
            maxR--;

            //rw
            for (int i = maxR, j = maxC; i >= minR; i--) {
                System.out.print(m1[i][j] + " ");
                count++;
            }
            maxC--;

            //tw
            for (int i = minR, j = maxC; j >= minC; j--) {
                System.out.print(m1[i][j]+" ");
                count++;
            }
            minR++;
        }
    }
}
