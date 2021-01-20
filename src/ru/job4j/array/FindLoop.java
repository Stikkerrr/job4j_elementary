package ru.job4j.array;

public class FindLoop {
	
	/**
	 * Brute force search method
	 *
	 * @param data the array in which we are looking for data
	 * @param el   the data we are looking for
	 * @return index cell of the array with the found value
	 */
	public static int indexOf(int[] data, int el) {
		int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
		for (int index = 0; index < data.length; index++) {
			if (data[index] == el) {
				rst = index;
				break;
			}
		}
		return rst;
	}
}
