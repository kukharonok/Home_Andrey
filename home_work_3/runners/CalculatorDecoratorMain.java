package home.home_work_3.runners;

import home.home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home.home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home.home_work_3.calcs.api.ICalculator;
import home.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {

        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());

        double result1 = calc.add(calc.add(4.1, calc.multiply(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println(result1); //140.45999999999998

        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calculator = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println(calculator.getCountOperation());  //5
            System.out.println(calculator.getICalculator());
        }

        ICalculator cal = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());

        double result2 = cal.add(cal.add(4.1, cal.multiply(15, 7)), cal.pow(cal.div(28, 5), 2));

        System.out.println(result2); //140.45999999999998

        if (cal instanceof CalculatorWithMemoryDecorator) {
            CalculatorWithMemoryDecorator calculator = (CalculatorWithMemoryDecorator) cal;
            System.out.println(calculator.getMemoryValue()); //140.45999999999998 - значение в памяти до очистки
            System.out.println(calculator.getMemoryValue()); //0.0 - в памяти уже 0
            System.out.println(calculator.getICalculator());
        }

    }
}
