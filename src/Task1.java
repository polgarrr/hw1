public class Task1 {
    public static void printAlphabet() {
        // я могла бы объявить и создать массив так, а затем заполнить его
       /* char[] latinAlphabet; // объявление массива
        latinAlphabet = new char[26]; // создание, то есть, выделение памяти для массива на 26 букв латиницы
        но сделаю короче */

        char[] latinAlphabet  = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (char i = 0; i < 26; i++) {
            System.out.println(latinAlphabet[i]);
        }
    }

    public static void main(String[] args) {
        printAlphabet();
    }
}

