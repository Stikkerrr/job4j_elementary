package ru.job4j.loop;

public class Counter {
	
	/**
	 * The method returns the sum of all numbers between the passed values
	 *
	 * @param start  number
	 * @param finish number
	 */
	public static int sum(int start, int finish) {
		int sum = 0;
		for (; start <= finish; start++) {
			sum += start;
		}
		return sum;
	}
	
	/**
	 * @param start  number
	 * @param finish number
	 * @return the sum of the even values ​​between the passed arguments
	 */
	public static int sumByEven(int start, int finish) {
		int sum = 0;
		for (; start <= finish; start++) {
			if (start % 2 == 0) {
				sum += start;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(0, 10));
		System.out.println(sum(3, 8));
		System.out.println(sum(1, 1));
		
		System.out.println(sumByEven(0, 10));
		System.out.println(sumByEven(3, 8));
		System.out.println(sumByEven(1, 1));
	}
}
