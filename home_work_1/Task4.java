package home.home_work_1;

/*
 * @author Kukharonok  Andrey
 */
public class Task4 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday) {
            System.out.println("Можем спать дальше");
            return true;
        } else {
            System.out.println("Пора идти на работу");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));// true
        System.out.println(sleepIn(true, false)); // false
        System.out.println(sleepIn(false, true));// true
        System.out.println(sleepIn(true, true));// true

    }
}
