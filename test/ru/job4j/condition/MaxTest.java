package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	
	@Test
	public void whenMax1To2Then2() {
		int result = Max.max(1, 2);
		assertThat(result, is(2));
	}
	
	@Test
	public void whenMaxMin324To37Then37() {
		int result = Max.max(-324, 37);
		assertThat(result, is(37));
	}
	
	@Test
	public void whenMax28To28Then28() {
		int result = Max.max(28, 28);
		assertThat(result, is(28));
	}
}