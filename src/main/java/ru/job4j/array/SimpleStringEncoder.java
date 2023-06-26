package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String rsl = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                rsl = counter > 1 ? rsl + symbol + counter : rsl + symbol;
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return counter > 1 ? rsl + symbol + counter : rsl + symbol;
    }
}
