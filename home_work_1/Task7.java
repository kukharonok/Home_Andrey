package home.home_work_1;

/*
 * @author Kukharonok  Andrey
 */
public class Task7 {

    public static void main(String[] args) {
        System.out.println(toBinaryString((byte) 15));//00001111
        System.out.println(toBinaryString((byte) -15));//11110000
        System.out.println(toBinaryString((byte) 42));//00101010
        System.out.println(toBinaryString((byte) -42));//11010101
        System.out.println(toBinaryString((byte) 3)); //00000011
        System.out.println(toBinaryString((byte) -3));//11111100
        System.out.println(toBinaryString((byte) 21)); //00010101
        System.out.println(toBinaryString((byte) -21));//11101010
        System.out.println(toBinaryString((byte) -128));//01111111
        System.out.println(toBinaryString((byte) 127));// 01111111
        System.out.println(toBinaryString((byte) -127));//10000000
    }

    public static String toBinaryString(byte number) {
        StringBuilder s = new StringBuilder();
        byte temp;
        if (number >= 0) {
            temp = number;
        } else {
            temp = (byte) (number - 1);
        }
        for (int i = 1; i <= 8; i++) {
            s.insert(0, (temp & 1) == 1 ? '1' : '0');
            temp >>= 1;
        }
        return s.toString();
    }
}



