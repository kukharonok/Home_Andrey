package home.home_work_2.arrays;

public class TaskCodeArray {

    public static void main(String[] args) {

        sumEvenPositiveNumbersArray(new int[]{5, 2, 8, -5, -3, 86, -8});
        maxEvenNumberArray(new int[]{5, 2, 8, -5, -3, 86, -8});
        minAverageArithmeticElementsArray(new int[]{10, 16, 8, -5, -1, 3, -8});
        twoMinElementsArray(new int[]{4, 65, 8, -6, -45, -78, 8});
        compressRangeArray(new int[]{2, 0, 65, 5, 15, 33, -6}, 4, 40);
        sumNumbersArray(new int[]{2, 1, 13, 0, 10, -6, -4});
    }

    /**
     * Печать в консоль суммы четных положительных элементов массива
     *
     * @param array целочисленный массив.
     */
    public static void sumEvenPositiveNumbersArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Cумма четных положительных элементов массива: " + sum);
    }

    /**
     * Печать в консоль максимального из элементов массива с четными индексами
     *
     * @param array целочисленный массив.
     */
    public static void maxEvenNumberArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный из элементов массива с четными индексами: " + max);
    }

    /**
     * Печать в консоль элементов массива, которые меньше среднего арифметического
     *
     * @param array целочисленный массив.
     */
    public static void minAverageArithmeticElementsArray(int[] array) {
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;

        for (int temp : array) {
            if (average > temp) {
                System.out.print(temp + " ");
            }
        }
        System.out.println();
    }

    /**
     * Печать в консоль двух наименьших элемента массива
     *
     * @param array целочисленный массив.
     */
    public static void twoMinElementsArray(int[] array) {
        int idxMin1 = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[idxMin1]) {
                idxMin1 = i;
            }
        }
        System.out.print("[" + idxMin1 + "] = " + array[idxMin1] + "; ");

        int idxMin2 = (idxMin1 == 0) ? 1 : 0;
        for (int i = 1; i < array.length; i++) {
            if (i == idxMin1) {
                continue;
            } else if (array[i] < array[idxMin2]) {
                idxMin2 = i;
            }
        }
        System.out.println("[" + idxMin2 + "] = " + array[idxMin2]);
    }

    /**
     * В массиве удаляются элементы, величина которых находится в интервале [а, b], массив сжимается влево,
     * освободившиеся в конце массива элементы заполняются нулями.
     * Обновленный массив печатается в консоль
     *
     * @param array целочисленный массив.
     * @param start начальный значение интервала [а, b]
     * @param end   конечное значение интервала [а, b]
     */
    public static void compressRangeArray(int[] array, int start, int end) {
        int[] temp = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (!(array[i] >= start && array[i] <= end)) {
                temp[j] = array[i];
                j++;
            }
        }
        for (int element : temp) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Печать в консоль суммы цифр всех значений массива.
     * Знак значений массива не учитывается
     *
     * @param array целочисленный массив.
     */
    public static void sumNumbersArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int n = Math.abs(array[i]);
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
        }
        System.out.println("Сумма цифр массива: " + sum);
    }
}









