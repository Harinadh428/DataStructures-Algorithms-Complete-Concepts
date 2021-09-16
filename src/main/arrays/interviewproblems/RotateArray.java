package main.arrays.interviewproblems;

/**
 * @author harinadh dasari
 */
public class RotateArray {
    public static void main(String[] args) {

        int[] str = {10, 20, 30, 40, 50, 60, 70, 80};
        int r = 4;
        r = r % str.length;
        if (r < 0) {
            r = (r + str.length);
        }
        int startIndex = 0;
        int endIndex = str.length - 1;

        rotateArray(str, startIndex, endIndex - r - 1);
        rotateArray(str, endIndex - r, endIndex);
        rotateArray(str, startIndex, endIndex);

        for (int s : str) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void rotateArray(int[] str, int startIndex, int endIndex) {

        while (startIndex < endIndex) {
            int temp = str[startIndex];
            str[startIndex] = str[endIndex];
            str[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
