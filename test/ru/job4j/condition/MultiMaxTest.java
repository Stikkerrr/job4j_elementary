package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
	
	@Test
	public void whenSecondMax() {
		int result = MultiMax.max(1, 4, 2);
		assertThat(result, is(4));
	}
	
	@Test
	public void whenFirstMax() {
		int result = MultiMax.max(5, 3, 0);
		assertThat(result, is(5));
	}
	
	@Test
	public void whenThirdMax() {
		int result = MultiMax.max(2, 7, 8);
		assertThat(result, is(8));
	}
	
	@Test
	public void whenNumEq() {
		int result = MultiMax.max(6, 6, 6);
		assertThat(result, is(6));
	}
}