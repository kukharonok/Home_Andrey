package home.home_work_2.loops;

public class LoopsTask1_1 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        if (a > 1) {
            int i = 1;
            long result = 1;
            StringBuilder s = new StringBuilder();
            while (i <= a) {
                result *= i;
                s.append(i).append(" * ");
                i++;
                if (result < 0) {
                    System.out.println("Переполнение максимального значения Long");
                    return;
                }
            }
            System.out.println(s.delete(s.length() - 3, s.length()).append(" = ").append(result));
        } else if (a == 1) {
            System.out.println("1 * 1 = 1");
        } else {
            System.out.println("Неправильно ввели число");
        }
    }
}

