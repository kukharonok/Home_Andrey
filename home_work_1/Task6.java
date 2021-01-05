package home.home_work_1;

/*
 * @author Kukharonok  Andrey
 */
public class Task6 {
    public static String createPhoneNumber(int[] num) {
        int count = 0;
        for (int a : num) {
            if (a / 10 == 0) {
                count++;
            }
        }
        if ((num.length == 10) && (count == 10)) {
            return String.format("(%d%d%d) %d%d%d-%d%d%d%d"
                    , num[0], num[1], num[2], num[3], num[4], num[5], num[6], num[7], num[8], num[9]);
        } else return "Data entered incorrectly";
    }

    public static void main(String[] args) {
        String phoneNumber1 = createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        String phoneNumber2 = createPhoneNumber(new int[]{1, 2, 30, 4, 5, 6, 7, 8, 9, 0});
        String phoneNumber3 = createPhoneNumber(new int[]{1, 3, 3, 4, 5, 9, 7, 8, 6, 7, 0});
        System.out.println(phoneNumber1); //(123) 456-7890
        System.out.println(phoneNumber2); //Data entered incorrectly
        System.out.println(phoneNumber3); //Data entered incorrectly
    }
}
