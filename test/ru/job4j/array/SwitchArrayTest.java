package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
	
	@Test
	public void whenSwap0to3() {
		int[] input = {1, 2, 3, 4};
		int[] expect = {4, 2, 3, 1};
		int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
		assertThat(rsl, is(expect));
	}
	
	@Test
	public void whenSwap10to100() {
		int[] input = {1, 2, 3, 4, 100, 74, 28, 13, 254, 10};
		int[] expect = {1, 2, 3, 4, 10, 74, 28, 13, 254, 100};
		int[] rsl = SwitchArray.swap(input, 4, input.length - 1);
		assertThat(rsl, is(expect));
	}
	
	@Test
	public void whenSwap3to33() {
		int[] input = {1, 3, 33, 4, 100, 74, 28, 13, 254, 10};
		int[] expect = {1, 33, 3, 4, 100, 74, 28, 13, 254, 10};
		int[] rsl = SwitchArray.swap(input, 1, 2);
		assertThat(rsl, is(expect));
	}
}