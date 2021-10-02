package main.corejava;

/**
 * @author harinadh dasari
 */
public class ShellRotating {
    public static void main(String[] args) {
        String[][] str = {
                {"a", "b", "c", "d"},
                {"e", "f", "g", "h"},
                {"i", "j", "k", "l"},
                {"m", "n", "o", "p"}
        };
        int r = 3;
        int s = 1;
            shellRotate(str, r, s);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void shellRotate(String[][] str, int r, int s) {
        String[] oneDArray = createOneDArrayFromShell(str, s);
        rotateOneDArray(oneDArray, r);
        fillShellFromOneDArray(str, oneDArray, s);
    }

    private static void fillShellFromOneDArray(String[][] str, String[] oneDArray, int s) {
        int minC = s - 1;
        int minR = s - 1;
        int maxR = str.length - s;
        int maxC = str[0].length - s;
        int index = 0;

        //lw
        for (int i = minR, j = minC; i <= maxR; i++) {
            str[i][j] = oneDArray[index++];
        }
        //bw
        for (int i = maxR, j = minC + 1; j <= maxC; j++) {
            str[i][j] = oneDArray[index++];
        }
        //rw
        for (int i = maxR - 1, j = maxC; i >= minR; i--) {
            str[i][j] = oneDArray[index++];
        }
        //tw
        for (int i = minR, j = maxC - 1; j >= minC + 1; j--) {
            str[i][j] = oneDArray[index++];
        }
    }

    private static void rotateOneDArray(String[] oneDArray, int r) {
        reverse(oneDArray, 0, oneDArray.length - r - 1);
        reverse(oneDArray, oneDArray.length - r, oneDArray.length-1);
        reverse(oneDArray, 0, oneDArray.length-1);
    }

    private static void reverse(String[] oneDArray, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            String temp = oneDArray[startIndex];
            oneDArray[startIndex] = oneDArray[endIndex];
            oneDArray[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private static String[] createOneDArrayFromShell(String[][] str, int s) {
        int minC = s - 1;
        int minR = s - 1;
        int maxR = str.length - s;
        int maxC = str[0].length - s;
        int size = 2 * (maxR - minR + maxC - minC);

        String[] oneDArray = new String[size];
        int index = 0;

        //lw
        for (int i = minR, j = minC; i <= maxR; i++) {
            oneDArray[index++] = str[i][j];
        }
        //bw
        for (int i = maxR, j = minC + 1; j <= maxC; j++) {
            oneDArray[index++] = str[i][j];
        }
        //rw
        for (int i = maxR - 1, j = maxC; i >= minR; i--) {
            oneDArray[index++] = str[i][j];
        }
        //tw
        for (int i = minR, j = maxC - 1; j >= minC + 1; j--) {
            oneDArray[index++] = str[i][j];
        }
        return oneDArray;
    }
}
