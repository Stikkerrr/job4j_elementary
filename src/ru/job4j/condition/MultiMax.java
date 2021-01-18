package ru.job4j.condition;

public class MultiMax {
	
	/**
	 * The method determines the largest number of three
	 *
	 * @param first  number
	 * @param second number
	 * @param third  number
	 */
	public static int max(int first, int second, int third) {
		if (first > second) {
			if (first > third) {
				return first;
			} else {
				return third;
			}
		} else {
			if (second > third) {
				return second;
			} else {
				return third;
			}
		}
	}
}


