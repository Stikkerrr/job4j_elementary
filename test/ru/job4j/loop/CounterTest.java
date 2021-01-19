package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
	
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		int result = Counter.sumByEven(1, 10);
		assertThat(result, is(30));
	}
	
	@Test
	public void whenSumEvenNumbersFromNineToEighteenThenSeventy() {
		int result = Counter.sumByEven(9, 18);
		assertThat(result, is(70));
	}
}