import java.util.Arrays;

public class Task6 {
    public static double[][] matrixAdd(double[][] matrix1,
                                       double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix2.length]; // создаю новую матрицу, задаю длину исходя из двух других
        for (int i = 0; i < matrix3.length; i++)
            for (int j = 0; j < matrix3.length; j++)
                for (int k = 0; k < matrix1.length; k++)
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j]; // произвожу непосредственное суммирование элементов двух матриц

        return matrix3;
}

    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};
        double[][] matrixAdd = matrixAdd(matrix1, matrix2);
        for (double[] array : matrixAdd) {
            System.out.println(Arrays.toString(array));
        }
    }
}