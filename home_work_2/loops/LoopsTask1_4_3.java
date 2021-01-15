package home.home_work_2.loops;

public class LoopsTask1_4_3 {

    public static void main(String[] args) {

        long a = 1;
        int b = -19;
        boolean overflowMarker = true;
        long result = 1;
        int bAbs = Math.abs(b);
        while (overflowMarker) {
            long aAbs = Math.abs(a);
            result = a * b;
            if (((aAbs | bAbs) >>> 31 != 0)) {
                if (result / b != a) {
                    overflowMarker = false;
                    System.out.println("Значение до переполнения: " + a);  // 799006685782884121
                }
            }
            a = result;
        }
        System.out.println("Значение после переполнения: " + result); // 3265617043834753317
    }
}



