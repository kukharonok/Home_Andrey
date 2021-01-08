package home.home_work_1;

/*
 * @author Kukharonok  Andrey
 */
public class Task4 {

    public static void main(String[] args) {
        boolean test = sleepIn(false, true);
        if (test) {
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (vacation || !weekday);
    }
}

