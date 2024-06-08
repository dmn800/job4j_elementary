package ru.job4j.calculator;

public class Fit {
    public enum Gender {
        MAN,
        WOMAN
    }

    public static double calculateWeight(short height, Gender gender) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }

        return switch (gender) {
            case MAN -> (height - 100) * 1.15;
            case WOMAN -> (height - 110) * 1.15;
        };
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double manWeight = calculateWeight(heightMan, Gender.MAN);
        System.out.println("Man 187 is " + manWeight);

        double womanWeight = calculateWeight(heightWoman, Gender.WOMAN);
        System.out.println("Woman 170 is " + womanWeight);
    }
}
