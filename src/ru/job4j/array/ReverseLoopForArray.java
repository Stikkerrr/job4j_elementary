package ru.job4j.array;

public class ReverseLoopForArray {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		int   temp;
		for (int i = 0; i < numbers.length; i++) {
			temp = numbers.length - 1 - i;
			if (temp % 2 == 0) {
				System.out.println("Текущий элемент массива начиная с последнего: "
									+ numbers[temp]);
			}
		}
	}
}
