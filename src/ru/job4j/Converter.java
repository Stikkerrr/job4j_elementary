package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {

        return value / 70;
    }

    public static int rubleToDollar(int value) {

        return value / 60;
    }

    public static int dollarToRuble(int value) {

        return value * 60;
    }

    public static int euroToRuble(int value) {

        return value * 70;
    }

    public static void main(String[] args) {

        boolean passed;
        int     in            = 420;
        int[]   expectedValue = new int[]{6, 7, 25200, 29400};

        for (int i = 0; i < 4; i++) {

            switch (expectedValue[i]) {

                case 6:
                    passed = expectedValue[i] == Converter.rubleToEuro(in);
                    System.out.println("Method rubleToEuro. Test result: " + passed);
                    break;
                case 7:
                    passed = expectedValue[i] == Converter.rubleToDollar(in);
                    System.out.println("Method rubleToDollar. Test result: " + passed);
                    break;
                case 25200:
                    passed = expectedValue[i] == Converter.dollarToRuble(in);
                    System.out.println("Method dollarToRuble. Test result: " + passed);
                    break;
                case 29400:
                    passed = expectedValue[i] == Converter.euroToRuble(in);
                    System.out.println("Method euroToRuble. Test result: " + passed);
                    break;
                default:
            }
        }
    }
}
