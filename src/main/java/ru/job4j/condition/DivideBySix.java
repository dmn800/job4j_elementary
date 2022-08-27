package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 == 0 && number % 3 == 0) {
            rsl = "Number divide by 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "Number divide by 3 and not even.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "Number no divide by 3 and even.";
        } else {
            rsl = "Number no divide by 3 and not even.";
        }
        return rsl;
    }

}
