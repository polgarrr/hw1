public class W2_Task2 {
    public static StringBuffer capitalizeEachWord(String str) {
        String[] singleWord = str.split(" ");
        int wordLength = singleWord.length;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < wordLength; i++) {
            result.append(Character.toUpperCase(singleWord[i].charAt(0))).append(singleWord[i].substring(1)).append(" ");
        }
        return result;
    }

    public static void main(String[] args) {
        String example = "Каждый охотник желает знать где сидит фазан";
        System.out.println(capitalizeEachWord(example).toString().trim()); // результат: "Каждый Охотник Желает Знать Где Сидит Фазан"
    }
}