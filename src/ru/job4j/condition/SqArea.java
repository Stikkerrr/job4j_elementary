package ru.job4j.condition;

public class SqArea
{
    public static double square(int p, int k)
    {
        return ((double) p) / (2 * ((double) k + 1)) * (double) k;
    }

    public static void main(String[] args)
    {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, real = " + result1);
    }
}
