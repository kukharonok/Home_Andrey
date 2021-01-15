package home.home_work_2.loops;

import java.util.regex.Pattern;

public class LoopsTask1_2 {

    public static void main(String[] args) {

        if (correctData(args[0])) {
            char[] chars = args[0].toCharArray();
            long multi = 1;
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars.length == 1) {
                    System.out.println("Нет множителей для произведения цифр");
                    return;
                }
                int number = Character.getNumericValue(chars[i]);
                s.append(number + " * ");
                multi *= number;
                if (multi < 0) {
                    System.out.println("Переполнение максимального значения Long");
                    return;
                }
            }
            System.out.println(s.delete(s.length() - 3, s.length()).append(" = ").append(multi));
        }
    }

    /**
     * Проверка корректности строки на наличие положительного целого числа
     *
     * @param s проверяемая строка класса String
     * @return true - если введено положительное целое число, false - если нет
     */
    public static boolean correctData(String s) {
        if (Pattern.matches("\\d+", s)) {
            return true;
        } else if (Pattern.matches("\\d+[.,]?\\d+", s)) {
            System.out.println("Введено не целое число");
            return false;
        } else {
            System.out.println("Введено не число");
            return false;
        }
    }
}

