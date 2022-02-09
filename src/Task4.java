import java.util.Arrays;

public class Task4 {
    // тут я думаю лучше юзать твой предыдуший createRandomArray с параметром n -- размером массива
    public static double[] createRandomArray() {
        double[] randomArray = new double[9]; // создала массив с рандомными значениями
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = Math.random();
        }
        return randomArray;
    }
    public static void getMinMaxAvg(double[] arr) {
        double min = arr[0]; // объявила мин, макс и сумму
        double max = arr[0];
        double sum = 0;

        for (double v : arr) {
            sum = sum + v; // sum += arr[i]; – суммирую все значения массива
            if (v < min) {
                min = v; // определяю минимальное число сравниванием
            } else if (v > max) {
                max = v; // определяю максимальное число сравниванием
            }
        }
        double avg = sum / arr.length; // рассчитываю среднее значение массива
        System.out.println("min value: " + min); // вывод данных
        System.out.println("max value: " + max);
        System.out.println("avg value: " + avg);
    }
    public static void main(String[] args) {
        double[] arr = createRandomArray();
        System.out.println(Arrays.toString(arr)); // показываю массив
        getMinMaxAvg(arr); // вызываю рассчеты
    }
}