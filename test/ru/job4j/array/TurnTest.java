package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
	
	@Test
	public void when123456Then654321() {
		int[] input  = new int[]{1, 2, 3, 4, 5, 6};
		int[] expect = new int[]{6, 5, 4, 3, 2, 1};
		int[] rsl    = Turn.back(input);
		assertThat(rsl, is(expect));
	}
	
	@Test
	public void when1234567Then7654321() {
		int[] input  = new int[]{1, 2, 3, 4, 5, 6, 7};
		int[] expect = new int[]{7, 6, 5, 4, 3, 2, 1};
		int[] rsl    = Turn.back(input);
		assertThat(rsl, is(expect));
	}
}