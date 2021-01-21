package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
	
	@Test
	public void whenSort() {
		int[] input = new int[] {3, 4, 1, 2, 5};
		int[] result = SortSelected.sort(input);
		int[] expect = new int[] {1, 2, 3, 4, 5};
		assertThat(result, is(expect));
	}
	
	@Test
	public void whenSorThreeNumbers() {
		int[] input = new int[] {28, 14, 35};
		int[] result = SortSelected.sort(input);
		int[] expect = new int[] {14, 28, 35};
		assertThat(result, is(expect));
	}
	
	@Test
	public void whenSortFiveNumbers() {
		int[] input = new int[] {134, 2, 9, 0, 56};
		int[] result = SortSelected.sort(input);
		int[] expect = new int[] {0, 2, 9, 56, 134};
		assertThat(result, is(expect));
	}
}