package home.home_work_2.loops;

public class LoopsTask1_4_4 {

    public static void main(String[] args) {

        long a = 1;
        int b = (int) (Math.random() * 200 - 100);
        boolean overflowMarker = true;
        long result = 1;
        long bAbs = Math.abs(b);
        while (overflowMarker) {
            long aAbs = Math.abs(a);
            result = a * b;
            if (((aAbs | bAbs) >>> 31 != 0)) {
                // Некоторые биты больше 2^31, которые могут вызвать переполнение
                // Проверьте результат с помощью оператора divide
                if ((b != 0) && (result / b != a)){
                    overflowMarker = false;
                    System.out.println("Значение до переполнения: " + a + " при b = " + b);
                }
            }
            a = result;
        }
        System.out.println("Значение после переполнения: " + result + " при b = " + b);
    }
}



