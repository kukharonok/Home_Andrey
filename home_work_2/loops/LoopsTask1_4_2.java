package home.home_work_2.loops;

public class LoopsTask1_4_2 {

    public static void main(String[] args) {

        long a = 1;
        int b = 188;
        long result = 1;
        while (a > 0) {
            result = a * b;
            if (result / b != a) {
                System.out.println("Значение до переполнения: " + a);  //1560496482665168896
            }
            a = result;
        }
        System.out.println("Значение после переполнения: " + result); //-1774566438301073408
    }
}