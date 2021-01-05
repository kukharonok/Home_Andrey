package home.home_work_1;
/*
 * @author Kukharonok  Andrey
 */

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        in.close();
        switch (name) {
            case "Вася":
                System.out.print("Привет!\nЯ тебя так долго ждал\n");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}

