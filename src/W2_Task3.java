

public class W2_Task3 {
    public static String getMiddleCharacter(String str) {
        int i = str.length() / 2;
        int j = str.length() / 2 + 1;
        String result = "";
        if (str.length() % 2 != 0) {
            result = str.substring(i, j);
        } else {
            result = str.substring(i - 1, j);
        }

        return result.toUpperCase();
    }


    public static void main(String[] args) {
        String oddString = "слово";
        System.out.println(getMiddleCharacter(oddString)); // результат: "О"
        String evenString = "пять";
        System.out.println(getMiddleCharacter(evenString)); // результат: "ят"
    }
}