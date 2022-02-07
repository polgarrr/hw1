import java.util.*;
import java.util.Arrays;

public class Task2 {
    public static void printReverseAlphabet() {
        // привожу тип char к типу-обертке, так как без этого аргумент для обратной сортировки метода sort работать не будет (он не работает с примитивными типами)
        Character[] latinAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Arrays.sort(latinAlphabet, Collections.reverseOrder());
        for (Character character : latinAlphabet) {
            System.out.println(character);
        }
    }

    public static void main(String[] args) {
        printReverseAlphabet();
    }
}
