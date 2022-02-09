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
        // тут переменная n скорее должна называться arrayLength, а твой arrayLength userInput
        double[] arr = createRandomArray(n);
        System.out.println(Arrays.toString(arr));
    }
}

// Комментарии скорее должны отвечать не на вопрос "что это такое", а "почему оно так" -- в непонятных ситуациях.
// Лучше просто писать самодокументированно -- а именно, понятные названия классов/методов/полей