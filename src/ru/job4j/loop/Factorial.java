package ru.job4j.loop;

public class Factorial {
	
	/**
	 * @param n the number for which the factorial is calculated
	 * @return factorial of the number passed as an argument
	 */
	public static int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
