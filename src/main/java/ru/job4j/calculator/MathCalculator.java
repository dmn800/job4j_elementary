package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumByDiffAndDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double sumByAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго расчета равен: " + sumByDiffAndDiv(10, 20));
        System.out.println("Результат третьего расчета равен: " + sumByAll(10, 20));
    }

}
