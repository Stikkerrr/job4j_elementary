package ru.job4j.loop;

public class PrimeNumber {
	
	/**
	 * @param finish value up to which it is necessary to check all numbers for evenness
	 * @return the number of primes found
	 */
	public static int calc(int finish) {
		int count = 0;
		for (int number = 2; number <= finish; number++) {
			if (CheckPrimeNumber.check(number)) {
				count++;
			}
		}
		return count;
	}
}
