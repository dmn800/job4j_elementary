package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void whenDay1() {
        int in = 1;
        String out = SwitchWeek.nameOfDay(in);
        String expected = "Monday";
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenDay8() {
        int in = 8;
        String out = SwitchWeek.nameOfDay(in);
        String expected = "Error";
        assertThat(out).isEqualTo(expected);
    }

}