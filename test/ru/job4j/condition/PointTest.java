package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {

        double expected = 2;
        int    x1       = 0;
        int    y1       = 0;
        int    x2       = 2;
        int    y2       = 0;
        double out      = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin45to2Min7then13() {

        double expected = 13.42;
        int    x1       = -4;
        int    y1       = 5;
        int    x2       = 2;
        int    y2       = -7;
        double out      = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18toMin72then10() {

        int    expected = 10;
        int    x1       = 1;
        int    y1       = 8;
        int    x2       = -7;
        int    y2       = 2;
        double out      = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when19toMin50then9() {

        double expected = 9.85;
        int    x1       = 1;
        int    y1       = 9;
        int    x2       = 5;
        int    y2       = 0;
        double out      = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}