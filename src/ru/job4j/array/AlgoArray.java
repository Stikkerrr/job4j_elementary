package ru.job4j.array;

public class AlgoArray {
	
	public static void main(String[] args) {
		int[] array = new int[]{5, 3, 2, 1, 4};
		for (int checkedIndex = 0; checkedIndex < array.length; checkedIndex++) {
			int value = array[checkedIndex];
			int i     = checkedIndex - 1;
			for (; i >= 0; i--) {
				if (value <= array[i]) {
					array[i + 1] = array[i];
				} else {
					break;
				}
			}
			array[i + 1] = value;
		}
		
		for (int i : array) {
			System.out.println(i);
		}
	}
}
