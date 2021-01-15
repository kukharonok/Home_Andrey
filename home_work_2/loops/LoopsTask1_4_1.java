package home.home_work_2.loops;

public class LoopsTask1_4_1 {

    public static void main(String[] args) {

        long a = 1;
        int b = 3;
        long result = 1;
        while (a > 0) {
            result = a * b;
            if (result / b != a) {
                System.out.println("Значение до переполнения: " + a);  //4052555153018976267
            }
            a = result;
        }
        System.out.println("Значение после переполнения: " + result); //-6289078614652622815
    }
}

