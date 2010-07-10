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
	}
}
