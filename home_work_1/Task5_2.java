package home.home_work_1;

import java.util.Objects;
import java.util.Scanner;

/*
 * @author Kukharonok  Andrey
 */
public class Task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        in.close();
        if (Objects.equals(name, "Вася")) {
            System.out.print("Привет!\nЯ тебя так долго ждал\n");
        } else if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}