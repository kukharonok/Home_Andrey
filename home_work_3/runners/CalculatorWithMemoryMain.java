package home.home_work_3.runners;

import home.home_work_3.calcs.additional.CalculatorWithMemory;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory calc = new CalculatorWithMemory();

        System.out.println("Результат выражения 1: " +
                calc.add(calc.add(4.1, calc.multiply(15, 7)), calc.pow(calc.div(28, 5), 2)));
        System.out.println(calc.getMemoryValue());  //140.45999999999998
        System.out.println(calc.getMemoryValue()); //0.0

        System.out.println("Результат выражения 2: " +
                calc.add(calc.add(10, calc.multiply(20, 7)), calc.pow(calc.div(15, 5), 2)));
        System.out.println(calc.getMemoryValue());  //159.0
        System.out.println(calc.getMemoryValue());  //0.0
    }
}
