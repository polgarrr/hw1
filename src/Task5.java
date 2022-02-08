import java.util.Arrays;

public class Task5 {
    public static int[] removeElement(int[] array, int elem) {
        int newArrayLength = array.length - getElemAmount(array, elem); // создаю переменную для обозначения длины нового массива
        int[] arrNew = new int[newArrayLength]; // объявляю новый массив

        int currentIndex = 0;
        for (int currentElem : array) {
            if (currentElem != elem) {
                arrNew[currentIndex] = currentElem; // заполняю новый массив  если значение массива не равно значению элемента, добавляю его в новый массив, обращаясь к индексу
                currentIndex++;
            }
        }
        return arrNew; // возвращаю массив
    }

    private static int getElemAmount(int[] array, int elem) {
        int count = 0;

        for (int elemFromArray : array) {
            if (elemFromArray == elem) { // считаю количество повторов элемента в старом массиве для подсчета длины нового
                count++;
            }

        }
        return count; // возвращаю количество элемента, встреченное в массиве
    }

    public static void main(String[] args) {
        int[] test_array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }
}
