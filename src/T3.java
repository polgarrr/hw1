public class T3 {
    public static String concatenation(String[] strings) {
        String result = "";
        for (String cont: strings) {
            result = result + cont;
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strings = {"abc", "bca"};
        System.out.println(concatenation(strings)); // должен вывести abcbca
    }
}