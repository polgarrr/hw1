import java.util.*;
import java.util.Arrays;

public class Task2 {
    public static void printReverseAlphabet() {
        // привожу тип char к типу-обертке, так как без этого аргумент для обратной сортировки метода sort работать не будет (он не работает с примитивными типами)
        Character[] latinAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; // хитро хитро)))
        Arrays.sort(latinAlphabet, Collections.reverseOrder()); // тут нужно просто циклом с 26го элемента до 1го пройтись,
        // а то получается больно много перебирать массив -- один раз для сортировки (в java используется quickSort со сложностью O(nlogn)) и один раз для вывода массива.
        for (Character character : latinAlphabet) {
            System.out.println(character);
        }
    }

    public static void main(String[] args) {
        printReverseAlphabet();
    }
}
