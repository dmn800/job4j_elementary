package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenDayFriday() {
        String in = "Friday";
        int expected = 5;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenDayZero() {
        String in = "Zero";
        int expected = 0;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertThat(out).isEqualTo(expected);
    }
}