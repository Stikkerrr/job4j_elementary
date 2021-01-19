package ru.job4j.loop;

public class Mortgage {
	
	/**
	 * @param amount  loan
	 * @param salary  annual income
	 * @param percent annual credit interest
	 * @return number of years to repay the loan
	 */
	public static int year(int amount, int salary, double percent) {
		int year = 0;
		while (amount > 0) {
			amount += (amount / 100 * percent);
			amount -= salary;
			year++;
		}
		return year;
	}
}
