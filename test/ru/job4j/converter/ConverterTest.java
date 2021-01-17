package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Converter;

public class ConverterTest {

    int in = 420;

    @Test
    public void rubleToEuro() {

        int expected = 6;
        int out      = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {

        int expected = 7;
        int out      = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {

        int expected = 25200;
        int out      = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {

        int expected = 29400;
        int out      = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
}