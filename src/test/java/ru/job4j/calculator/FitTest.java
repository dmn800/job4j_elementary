package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.calculateWeight(in, Fit.Gender.MAN);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.calculateWeight(in, Fit.Gender.WOMAN);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenManHeight187ThenCorrectWeight() {
        double weight = Fit.calculateWeight((short) 187, Fit.Gender.MAN);
        assertThat(weight).isCloseTo(100.05, within(0.01));
    }

    @Test
    public void whenWomanHeight170ThenCorrectWeight() {
        double weight = Fit.calculateWeight((short) 170, Fit.Gender.WOMAN);
        assertThat(weight).isCloseTo(69.0, within(0.01));
    }

    @Test
    public void whenNegativeHeightThenThrowException() {
        short height = -150;
        assertThatThrownBy(() -> Fit.calculateWeight(height, Fit.Gender.MAN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Height must be greater than 0");
    }

    @Test
    public void whenZeroHeightThenThrowException() {
        short height = 0;
        assertThatThrownBy(() -> Fit.calculateWeight(height, Fit.Gender.WOMAN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Height must be greater than 0");
    }
}