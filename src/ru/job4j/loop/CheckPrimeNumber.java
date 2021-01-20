package ru.job4j.loop;

public class CheckPrimeNumber {
	
	/**
	 * The method checks a number for simplicity
	 *
	 * @param number the number whose simplicity needs to be determined
	 */
	public static boolean check(int number) {
		boolean prime = number > 1;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
