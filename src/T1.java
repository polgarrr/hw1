import java.util.Locale;

public class T1 {
    public static String insertDash(String str) {
        String result = str.trim().toUpperCase(Locale.ROOT);
        result = result.replace(" ", "-");

        return result;
    }

    public static void main(String[] args) {
        String str = " London is the capital of Great Britain ";
        System.out.println(insertDash(str)); // "LONDON-IS-THE-CAPITAL-OF-GREAT-BRITAIN"
    }
}