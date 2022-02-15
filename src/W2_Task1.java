public class W2_Task1 {
    public static int calc(String equation) {
        String[] numberFromString = equation.split(" \\+ ");
        int result = 0;
        try {
            for (String d : numberFromString) {
                result += Integer.parseInt(d);
            }
        }
        catch(Exception e) {
            System.out.println("Incorrect input");
        }
        return result;
    }

    public static void main (String[] args) {
        String equation = "123123 + 123123";
        System.out.println(calc(equation)); // результат: 246246
    }
}
