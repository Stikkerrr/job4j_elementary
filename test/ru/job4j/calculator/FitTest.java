package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    short in = 180;

    @Test
    public void manWeight() {

        double expected = 92;
        double out      = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {

        double expected = 80.5;
        double out      = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}