import java.util.Arrays;

public class Task7 {
    public static double[][] matrixMultiply(double[][]
                                                    matrix1, double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix3[0].length; i++)
            for (int j = 0; j < matrix3.length; j++)
                for (int k = 0; k < matrix1[0].length; k++)
                    matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];

        return matrix3;
    }

    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};
        double[][] matrixMultiply = matrixMultiply(matrix1, matrix2);
        for (double[] array : matrixMultiply) {
            System.out.println(Arrays.toString(array));
        }
    }
}