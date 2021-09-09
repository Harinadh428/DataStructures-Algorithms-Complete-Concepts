package main.arrays.twodimesionalarray;

/**
 * @author harinadh dasari
 */
public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] matrix1 = {{2, 2, 2}, {2, 2, 2}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {0, 0, 0, 0}};

        System.out.println("Displaying Matrix 1");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Displaying Matrix 2");

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix Multiplication Result");

        int[][] product = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < product.length; i++) {

            for (int j = 0; j < product[i].length; j++) {
                for (int k = 0; k < matrix1[i].length; k++) {
                    product[i][j] = product[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
