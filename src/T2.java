import java.util.Locale;

public class T2 {
    public static String capitalize(String str) {
        String result = str.substring(0, 1).toUpperCase(Locale.ROOT);
        result += str.substring(1);
    return result;
    }
    public static void main(String[] args) {
        String str = "каждый охотник желает знать где сидит фазан";
        System.out.println(capitalize(str)); // "Каждый охотник желает знать где сидит фазан"
    }
}