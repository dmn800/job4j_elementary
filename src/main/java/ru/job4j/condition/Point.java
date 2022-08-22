package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int rsl1 = x2 - x1;
        int rsl2 = y2 - y1;
        double rsl3 = Math.pow(rsl1, 2);
        double rsl4 = Math.pow(rsl2, 2);
        double rsl5 = rsl3 + rsl4;
        double rsl = Math.sqrt(rsl5);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }

}
