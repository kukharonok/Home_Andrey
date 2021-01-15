package home.home_work_2.loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int j = 2; j < 6; j++) {
                if ((i < 10) && (i * j / 10 == 0)) {
                    System.out.print(j + " * " + i + " =   " + j * i + " | ");
                } else if ((i < 10) && (i * j / 10 > 0)) {
                    System.out.print(j + " * " + i + " =  " + j * i + " | ");
                } else {
                    System.out.print(j + " * " + i + " = " + j * i + " | ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");

        for (int i = 1; i < 11; i++) {
            for (int j = 6; j < 10; j++) {
                if ((i < 10) && (i * j / 10 == 0)) {
                    System.out.print(j + " * " + i + " =   " + j * i + " | ");
                } else if ((i < 10) && (i * j / 10 > 0)) {
                    System.out.print(j + " * " + i + " =  " + j * i + " | ");
                } else {
                    System.out.print(j + " * " + i + " = " + j * i + " | ");
                }
            }
            System.out.println();
        }
    }
}
