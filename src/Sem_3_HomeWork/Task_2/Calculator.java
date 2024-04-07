package Sem_3_HomeWork.Task_2;

import static java.lang.Double.*;

/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {

    public static <T extends Number> void sum(T first, T second) {
        double result;
        result = first.doubleValue() + second.doubleValue();
        System.out.println(first + " + " + second + " = " + result);
    }

    public static <T extends Number> void multiply(T first, T second) {
        double result;
        result = first.doubleValue() * second.doubleValue();
        System.out.println(first + " * " + second + " = " + result);
    }

    public static <T extends Number, U extends Number> void divide(T first, U second ) {
        double result;
//        Integer res = (Integer) second;
        if (second.doubleValue() != 0.0) {
            result = first.doubleValue() / second.doubleValue();
            System.out.println(first + " / " + second + " = " + result);
        } else {
            System.out.println("Attempt to divide by zero: " + first + " / " + second);
        }
    }

    public static <T extends Number> void subtract(T first, T second) {
        double result;
        result = first.doubleValue() - second.doubleValue();
        System.out.println(first + " - " + second + " = " + result);
    }

    public static void main(String[] args) {
        sum(5, 4);
        multiply(6, 2.5);
        divide(15, 3.0);
        divide(15, 0);
        subtract(4, 2.5);

    }
}
