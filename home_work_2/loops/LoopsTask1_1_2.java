package home.home_work_2.loops;

import java.util.regex.Pattern;

public class LoopsTask1_1_2 {

    public static void main(String[] args) {

        if (Pattern.matches("[1-9][0-9]*", args[0])) {
            long result = factorials(Integer.parseInt(args[0]));
            System.out.println(result);
        } else {
            System.out.println("Неправильно введены данные");
        }
    }

    /**
     * Нахождение факториала числа n c выводом в консоль ходом перемножения чисел
     *
     * @param n целое число
     * @return факториал числа n
     * @throws ArithmeticException если результат переполняет значение long
     */
    static long factorials(int n) {
        long result = 1;
        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }
        System.out.print(n);

        if (n != 2) {
            System.out.print(" * ");
        }
        result = n * factorials(n - 1);
        if (result < 0) {
            throw new ArithmeticException("long overflow");

        }
        return result;
    }
}



