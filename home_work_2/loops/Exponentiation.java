package home.home_work_2.loops;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {

        double a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        a = scanner.nextDouble();
        System.out.print("Введите целое положительное значение степени: ");
        b = scanner.nextInt();
        int i = 1;
        double exp = 1;
        while (i <= b) {
            exp *= a;
            i++;
        }
        scanner.close();
        System.out.print(a + " ^ " + b + "= " + exp);
    }
}
