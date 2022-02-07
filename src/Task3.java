import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static double[] createRandomArray(int n) {
        double[] randomArray = new double[n]; // создаю массив с заданной длиной
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = Math.random(); //наполняю массив рандомными значениями и иду по нему
        }
        return randomArray; // возвращаю массив
    }

    public static void main(String[] args) {
        Scanner arrayLength = new Scanner(System.in); // вытаскиваю число из ввода пользователя
        int n = arrayLength.nextInt(); // считываю длину массива из пользовательского ввода
        double[] arr = createRandomArray(n);
        System.out.println(Arrays.toString(arr));
    }
}