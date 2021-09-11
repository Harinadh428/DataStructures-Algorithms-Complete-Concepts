package main.arrays.twodimesionalarray;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class RotateArray {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};

        rotateArray(str, 3);

        Arrays.stream(str).forEach(e -> System.out.print(e + " "));
    }

    private static void rotateArray(String[] str, int part) {
        rotatePart1(str, 0, (str.length - 1) - part);
        rotatePart2(str, (str.length) - part, str.length - 1);
        rotateWhole(str);
    }

    private static void rotateWhole(String[] str) {
        for (int i = 0, j = str.length - 1; i < str.length / 2; i++, j--) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }

    private static void rotatePart2(String[] str, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            String temp = str[startIndex];
            str[startIndex] = str[endIndex];
            str[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private static void rotatePart1(String[] str, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            String temp = str[startIndex];
            str[startIndex] = str[endIndex];
            str[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
