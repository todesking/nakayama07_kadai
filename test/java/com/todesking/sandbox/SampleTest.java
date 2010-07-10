package com.todesking.sandbox;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SampleTest {
	@Before
	public void before() {
		this.target = new Sample();
	}

	private Sample target;

	@Test
	public void test_getHello() throws Exception {
		assertThat(target.getHello(""), is("Hello "));
		assertThat(target.getHello("World"), is("Hello World"));
		assertThat(target.getHello("Sample"), is("Hello Sample"));
	}

	@Test
	public void test_divide() throws Exception {
		assertThat(target.divide(1, 1), is(1 / 1));
		assertThat(target.divide(10, 3), is(10 / 3));
	}

	@Test(expected = ArithmeticException.class)
	public void test_divide_by0() throws Exception {
		target.divide(10, 0);
	}
}
