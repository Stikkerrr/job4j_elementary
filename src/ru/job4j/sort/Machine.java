package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
	
	/**
	 * Calculates the denomination and the number of coins required for change
	 *
	 * @param money deposited into the machine
	 * @param price of goods
	 * @return array of coins of various denominations, the amount of which corresponds to change
	 */
	public static int[] change(int money, int price) {
		int[] coins = {10, 5, 2, 1};
		int[] rsl   = new int[100];
		int   size  = 0;
		int   diff  = money - price;
		for (int coin : coins) {
			while (diff >= coin) {
				diff -= coin;
				rsl[size++] = coin;
			}
		}
		return Arrays.copyOf(rsl, size);
	}
}
