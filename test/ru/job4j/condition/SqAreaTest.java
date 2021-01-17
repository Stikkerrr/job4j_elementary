package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square62() {

        int    expected = 2;
        int    p        = 6;
        int    k        = 2;
        double out      = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square91() {

        double expected = 5.06;
        int    p        = 9;
        int    k        = 1;
        double out      = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square73() {

        double expected = 2.30;
        int    p        = 7;
        int    k        = 3;
        double out      = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}