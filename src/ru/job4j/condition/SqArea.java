package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {

        double h = ((double) p) / (2 * ((double) k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {

        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, real = " + result1);
    }
}
